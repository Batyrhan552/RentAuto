package kg.megacom.RendAvto.servise.impl;

import kg.megacom.RendAvto.dao.CarRepo;
import kg.megacom.RendAvto.mappers.CarMapper;
import kg.megacom.RendAvto.models.Car;
import kg.megacom.RendAvto.models.Status;
import kg.megacom.RendAvto.models.dto.CarDto;
import kg.megacom.RendAvto.servise.CarServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarServiseImpl implements CarServise {
    @Autowired
    private CarRepo carRepo;



    @Override
    public CarDto findById(Long id) {
        Car car = carRepo.findById(id).orElse(null);
        System.out.println(car);
        if(car == null){
            throw new RuntimeException("Not found");
        }
        return CarMapper.INSTANCE.carToCarDto(car);
    }

    @Override
    public List<CarDto> findAllByCategory() {
        List<Car> carList = carRepo.findAllByCAtegory();
        return CarMapper.INSTANCE.carListToCarToList(carList);
    }

//    @Override
//    public List<Car> findByPriceOrderBy(Car car) {
//        return carRepo.findByPriceOrderBy(car);
    //}

//    @Override
//    public List<CarDto> findByIdCategory(CarCategory carCategory) {
//      List<CarCategory> sortCategory = findByIdCategory(carCategory).stream()
//              .sorted(Comparator.comparing(CarDto::getCarCategory))
//              .collect(Collectors.toList());
//         sortCategory.forEach(System.out::println);
//         Car carSort = CarMapper.INSTANCE.carDtoToCar();
//        return CarMapper.INSTANCE.carListToCarToList();
//    }

    @Override
    public CarDto update(CarDto carDto) { // пришли для измнения
        Car car = carRepo.findById(carDto.getId()).orElse(null);
        CarDto car1 = CarMapper.INSTANCE.carToCarDto(car); // из БД
        if(car == null){
            throw  new RuntimeException("Not found");
        }

        car1.setModel(carDto.getModel());
        car1.setBaggage(carDto.getBaggage());
        car1.setStatus(carDto.getStatus());
        car1.setYear(carDto.getYear());
        car1.setDoors(carDto.getDoors());
        car1.setSeats(carDto.getSeats());
        car1.setRentPrice(carDto.getRentPrice());
        //Вызвал внутри класса Car другой класс CarDesr и использовал его методы для Update
        car1.setCarDesr(carDto.getCarDesr());
//        car1.getCarDesr().setFuelConsumption(carDto.getCarDesr().getFuelConsumption());
//        car1.getCarDesr().setTransmissions(carDto.getCarDesr().getTransmissions());
//        car1.getCarDesr().setLang(carDto.getCarDesr().getLang());
//        car1.getCarDesr().setSide(carDto.getCarDesr().getSide());
//        car1.getCarDesr().setTypeOfDrive(carDto.getCarDesr().getTypeOfDrive());
        car1.setRentPrice(carDto.getRentPrice());
        car1.setCarCategory(carDto.getCarCategory());
        Car carUpdate = CarMapper.INSTANCE.carDtoToCar(car1);
        carUpdate = carRepo.save(carUpdate);
        return CarMapper.INSTANCE.carToCarDto(carUpdate);
    }

    @Override
    public CarDto saveCar(CarDto carDto) {
       Car car= CarMapper.INSTANCE.carDtoToCar(carDto);
       car.setStatus(Status.AVIALABLE);
       car = carRepo.save(car);
        System.out.println(car);
         return CarMapper.INSTANCE.carToCarDto(car);
    }

    @Override
    public Car delete(Long id) {
        if (carRepo.existsById(id)){
            Car car = carRepo.findById(id).get();
            car.setActive(false);
            car = carRepo.save(car);
            return car;
        }
       throw new RuntimeException("Car by id not found!");
    }

    @Override
    public List<CarDto> findAll() {
        List<Car> carList = carRepo.findAll();
        return CarMapper.INSTANCE.carListToCarToList(carList);
    }

    @Override
    public List<Car> findByCAtegory(String categoryName) {
        System.out.println(carRepo.findbyCategory(categoryName));
        return carRepo.findbyCategory(categoryName);
    }

    @Override
    public List<Car> findByPrice(Double price) {
        return carRepo.findbyPrice(price);
    }

    @Override
    public List<Car> findByModel(String model) {
        return  carRepo.findbyModel(model);
    }

    @Override
    public List<Car> findBySeats(Byte seats) {
        return carRepo.findbySeats(seats);
    }

    @Override
    public List<Car> findByBaggeg(Byte baggege) {
        return carRepo.findbyBaggege(baggege);
    }

    @Override
    public List<Car> findByDoors(Byte doors) {
        return carRepo.findbyDoors(doors);
    }

    @Override
    public List<Car> findByStatus(Status status) {
        return carRepo.findByStatus(status);
    }

    @Override
    public List<Car> findByRented(Boolean rented) {
        return carRepo.findByRented(rented);
    }
}
