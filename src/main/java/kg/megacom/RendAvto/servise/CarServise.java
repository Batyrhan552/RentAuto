package kg.megacom.RendAvto.servise;

import kg.megacom.RendAvto.models.Car;
import kg.megacom.RendAvto.models.Status;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

public interface CarServise {
    Car saveCar(Car car);
    List<Car> findByCAtegory(String categoryName);
    List<Car> findByPrice(BigDecimal  price);
    List<Car> findByModel(String model);
    List<Car> findBySeats( Byte seats);
    List<Car> findByBaggeg(Byte baggege);
    List<Car> findByDoors( Byte seats);
    List<Car> findByStatus( Status status);
    List<Car> findByRented( Boolean rented);

}
