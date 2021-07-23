package kg.megacom.RendAvto.Controllers;

import io.swagger.annotations.Api;
import kg.megacom.RendAvto.configuration.Swagger2Config;
import kg.megacom.RendAvto.models.Car;
import kg.megacom.RendAvto.models.CarCategory;
import kg.megacom.RendAvto.models.Status;
import kg.megacom.RendAvto.models.dto.CarDto;
import kg.megacom.RendAvto.servise.CarCateServise;
import kg.megacom.RendAvto.servise.CarServise;
import kg.megacom.RendAvto.servise.RentPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
//@Api(tags = {Swagger2Config.Car})
@RestController
public class CarController {
    @Autowired
   private CarServise carServise;
   @Autowired
   private CarCateServise carCateServise;
   @Autowired
   private RentPriceService rentPriceService;


    @PostMapping("/saveCar")
    public CarDto saveCar(@RequestBody CarDto carDto){
        return carServise.saveCar(carDto);
    }

    @GetMapping("/findbyCategory")
    public List<Car> findbycategory(@RequestParam String nameCategory){
        return carServise.findByCAtegory(nameCategory);
    }

    @GetMapping("/findbyPrice")
    public List<Car> findbyPrice(@RequestParam Double price){
        return carServise.findByPrice(price);
    }

    @GetMapping("/findByModel")
    public List<Car> findByModel(@RequestParam String model) {
        return carServise.findByModel(model);

    }
    @GetMapping("/findbySeats")
                public List<Car> findbySeats(@RequestParam Byte seats){
            return  carServise.findBySeats(seats);

    }
    @GetMapping("/findbyBaggege")
    public List<Car> findbyBaggege(@RequestParam Byte baggege) {
        return carServise.findByBaggeg(baggege);
    }

    @GetMapping("/findbyDoors")
    public List<Car> findbyDoors(@RequestParam Byte doors) {
        return carServise.findByDoors(doors);
    }

    @GetMapping("/findbyRented")
    public List<Car> findbyRented(@RequestParam Boolean rented) {
        return carServise.findByRented(rented);
    }
    @GetMapping("/findbyStatus")
    public List<Car> findbyStatus(@RequestParam Status status) {
        return carServise.findByStatus(status);
    }

    @PutMapping("/update")
    public CarDto update(@RequestBody  CarDto car){
        return carServise.update(car);
    }

    @DeleteMapping("/delete/{id}")
    public Car delete(@PathVariable Long id){
        return carServise.delete(id);

    }
    @GetMapping("/findById")
    public CarDto findById(@RequestParam Long id){
        return carServise.findById(id);
    }

    @GetMapping("/findAll")
    public List<CarDto> findAll(){
        return carServise.findAll();
    }

    @GetMapping("/findAllByCategory")
    public List<CarDto> findAllByCategory(){
        return carServise.findAllByCategory();
    }

}
