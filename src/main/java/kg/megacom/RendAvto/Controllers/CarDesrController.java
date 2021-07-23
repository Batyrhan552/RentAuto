package kg.megacom.RendAvto.Controllers;

import kg.megacom.RendAvto.models.CarDesr;
import kg.megacom.RendAvto.models.dto.CarDesrDto;
import kg.megacom.RendAvto.servise.CarDesrServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarDesrController {

    @Autowired
    private CarDesrServise carDesrServise;

    @PostMapping("/saveCarDesr")
    public CarDesrDto saveCarDesr(@RequestBody CarDesrDto carDesr){
        return carDesrServise.saveCarDesr(carDesr);
    }
}
