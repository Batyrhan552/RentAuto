package kg.megacom.RendAvto.servise.impl;

import kg.megacom.RendAvto.dao.CarRepo;
import kg.megacom.RendAvto.models.Car;
import kg.megacom.RendAvto.models.Status;
import kg.megacom.RendAvto.servise.CarServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CarServiseImpl implements CarServise {
    @Autowired
    private CarRepo carRepo;

    @Override
    public Car saveCar(Car car) {
        return carRepo.save(car);
    }

    @Override
    public List<Car> findByCAtegory(String categoryName) {
        System.out.println(carRepo.findbyCategory(categoryName));
        return carRepo.findbyCategory(categoryName);
    }

    @Override
    public List<Car> findByPrice(BigDecimal price) {
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
