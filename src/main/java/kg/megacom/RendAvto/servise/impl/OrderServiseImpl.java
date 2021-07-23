package kg.megacom.RendAvto.servise.impl;

import kg.megacom.RendAvto.dao.CarRepo;
import kg.megacom.RendAvto.dao.repository.ClientRepo;
import kg.megacom.RendAvto.dao.repository.OrderRepo;
import kg.megacom.RendAvto.dao.repository.RentPriceRepo;
import kg.megacom.RendAvto.mappers.CarMapper;
import kg.megacom.RendAvto.mappers.ClientMapper;
import kg.megacom.RendAvto.mappers.OrderMapper;
import kg.megacom.RendAvto.models.*;
import kg.megacom.RendAvto.models.dto.CarDto;
import kg.megacom.RendAvto.models.dto.ClientDto;
import kg.megacom.RendAvto.models.dto.OrderDto;
import kg.megacom.RendAvto.models.objects.CarData;
import kg.megacom.RendAvto.servise.OrderServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiseImpl implements OrderServise {
    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private CarRepo carRepo;
    @Autowired
    private ClientRepo clientRepo;
    @Autowired
    private RentPriceRepo rentPriceRepo;


    @Override
    public OrderDto saveOrder(CarData carData) {
        Car car = carRepo.findById(carData.getCarId()).orElse(null);
        CarDto carDto= CarMapper.INSTANCE.carToCarDto(car);
        Client client = clientRepo.findByEmail(carData.getEmail());
        ClientDto clientDto = ClientMapper.INSTANCE.clientToClientDto(client);
        if (client==null){
            ClientDto client1 = new ClientDto();
            client1.setFirstName(carData.getName());
            client1.setLastName(carData.getLastName());
            client1.setEmail(carData.getEmail());
            client1.setPhoneNumber(carData.getPhoneNumber());
            client1.setActive(true);
            Client saveClient = ClientMapper.INSTANCE.clientDtoToClient(client1);
            saveClient = clientRepo.save(saveClient);
            System.out.println(saveClient);
            Order order = new Order();
            order.setCar(car);
            order.setClient(saveClient);
            order.setStartDateRent(new Date());
            order.setEndDateRent(carData.getReturnDate());
            order.setPickUpLocation(carData.getPickup());
            order.setReturnLocation(carData.getReturnPlace());
            SimpleDateFormat smpl = new SimpleDateFormat("yyyy.MM.dd");
            double totalSum = (double) (order.getEndDateRent().getTime() - order.getStartDateRent().getTime())/(24 * 3600 * 1000);
            order.setTotalSum(car.getRentPrice().getPrice()* totalSum);
            car.setStatus(Status.RENTED);
            order = orderRepo.save(order);
            return OrderMapper.INSTANCE.orderToOrderDto(order);

        }else {
            Order order = new Order();
            order.setCar(car);
            order.setClient(client);
            order.setStartDateRent(new Date());
            order.setEndDateRent(carData.getReturnDate());
            order.setPickUpLocation(carData.getPickup());
            order.setReturnLocation(carData.getReturnPlace());
            double totalSum = (double) (order.getEndDateRent().getTime() - order.getStartDateRent().getTime())/(24 * 60 * 60 * 1000);
            order.setTotalSum(car.getRentPrice().getPrice()* totalSum);
            order = orderRepo.save(order);
            return OrderMapper.INSTANCE.orderToOrderDto(order);

        }

    }
        //findCarById
       //findClientByEmail

        //saveClient
        //saveOrder

//        Order order = OrderMapper.INSTANCE.orderDtoToOrder(orderDto);
//        Car car = order.getCar();
//        car = carRepo.findById(carId).orElse(null);
//        if (car.getId() == null) {
//            throw new RuntimeException("Not found");
//
//        }
//        Client client = order.getClient();
//        client = clientRepo.findById(clientId).orElse(null);
//        if (client.getId() == null) {
//            throw new RuntimeException("Not found");
//
//        }
//        RentPrice rentPrice = order.getCar().getRentPrice();
//        rentPrice = rentPriceRepo.findById(rentPriceId).orElse(null);
//        if (rentPrice.getId() == null) {
//            throw new RuntimeException("Not found");
//        }
//        order.setCar(car);
//        order.setClient(client);
//        Order order1 = orderRepo.save(order);
//        return OrderMapper.INSTANCE.orderToOrderDto(order1);


    @Override
    public List<OrderDto> findAll() {
        List<Order> orders = orderRepo.findAll();
        List<OrderDto> orderDto = OrderMapper.INSTANCE.orderListToOrderToList(orders);
        return orderDto;
}

    @Override
    public OrderDto update(Long id ,CarData carData) {
        if(orderRepo.existsById(id)){
            Order order = orderRepo.getById(id);
            Car car = carRepo.getById(carData.getCarId());
            Client client = clientRepo.findByEmail(carData.getEmail());
            order.setCar(car);
            order.setClient(client);
            order.setStartDateRent(carData.getPickUpDate());
            order.setEndDateRent(carData.getReturnDate());
            order.setPickUpLocation(carData.getPickup());
            order.setReturnLocation(carData.getReturnPlace());
            order = orderRepo.save(order);
            return OrderMapper.INSTANCE.orderToOrderDto(order);

        }
        throw new RuntimeException("Not found");

    }

    @Override
    public Order delete(Long id) {
        if (carRepo.existsById(id)){
            Order order = orderRepo.findById(id).get();
            order.setActive(false);
            order = orderRepo.save(order);
            return order;
        }
        throw new RuntimeException("Car by id not found!");

    }

}



