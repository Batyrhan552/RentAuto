package kg.megacom.RendAvto.Controllers;

import kg.megacom.RendAvto.models.Car;
import kg.megacom.RendAvto.servise.CarServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
   private CarServise carServise;

    @PostMapping("/saveCar")
    public Car saveCar(@RequestBody Car car){
        return carServise.saveCar(car);
    }
}
