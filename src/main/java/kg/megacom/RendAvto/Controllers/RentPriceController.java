package kg.megacom.RendAvto.Controllers;

import kg.megacom.RendAvto.models.RentPrice;
import kg.megacom.RendAvto.models.dto.RentPriceDto;
import kg.megacom.RendAvto.servise.RentPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rent-price")
public class RentPriceController {
    @Autowired
    private RentPriceService rentPriceService;

    @PostMapping("/saveRentPrice")
    public RentPriceDto saveRentPrice(@RequestBody RentPriceDto rentPrice){
        return rentPriceService.saveRentPrice(rentPrice);
    }
    @GetMapping("/findAll")
    public List<RentPriceDto> findAll(){
        return rentPriceService.findAll();
    }
     @PutMapping("/update")
    public RentPriceDto update(@RequestBody RentPriceDto rentPriceDto){
        return rentPriceService.update(rentPriceDto);
     }
}
