package kg.megacom.RendAvto.servise;

import kg.megacom.RendAvto.models.CarCategory;
import kg.megacom.RendAvto.models.dto.CarCategoryDto;

public interface CarCateServise {
    CarCategoryDto saveCarCategory(CarCategoryDto carCategory);
}
