package kg.megacom.RendAvto.servise;

import kg.megacom.RendAvto.models.Car;
import kg.megacom.RendAvto.models.Status;
import kg.megacom.RendAvto.models.dto.CarDto;

import java.util.List;

public interface CarServise {
    List<CarDto> findAll();
    CarDto findById(Long id);
   List<CarDto> findAllByCategory();
    CarDto update(CarDto carDto);
    CarDto saveCar(CarDto carDto);
    Car  delete(Long active);
    List<Car> findByCAtegory(String categoryName);
    List<Car> findByPrice(Double  price);
    List<Car> findByModel(String model);
    List<Car> findBySeats( Byte seats);
    List<Car> findByBaggeg(Byte baggege);
    List<Car> findByDoors( Byte seats);
    List<Car> findByStatus( Status status);
    List<Car> findByRented( Boolean rented);

}
