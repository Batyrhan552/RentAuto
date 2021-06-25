package kg.megacom.RendAvto.Controllers;

import kg.megacom.RendAvto.models.RentPrice;
import kg.megacom.RendAvto.servise.RentPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentPriceController {
    @Autowired
    private RentPriceService rentPriceService;

    @PostMapping("/saveRentPrice")
    public RentPrice saveRentPrice(@RequestBody RentPrice rentPrice){
        return rentPriceService.saveRentPrice(rentPrice);
    }
}
