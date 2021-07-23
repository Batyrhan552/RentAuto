package kg.megacom.RendAvto.Controllers;

import kg.megacom.RendAvto.models.CarCategory;
import kg.megacom.RendAvto.models.dto.CarCategoryDto;
import kg.megacom.RendAvto.servise.CarCateServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarCAtegoryController {
    @Autowired
    private CarCateServise carCateServise;

    @PostMapping("/saveCarCategory")
    public CarCategoryDto saveCarCategory(@RequestBody CarCategoryDto carCategory){
        return carCateServise.saveCarCategory(carCategory);
    }

}
