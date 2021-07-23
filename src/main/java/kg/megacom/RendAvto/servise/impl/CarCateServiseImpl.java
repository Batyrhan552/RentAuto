package kg.megacom.RendAvto.servise.impl;

import kg.megacom.RendAvto.dao.repository.CarCategoryRepo;
import kg.megacom.RendAvto.mappers.CarCategoryMapper;
import kg.megacom.RendAvto.models.CarCategory;
import kg.megacom.RendAvto.models.dto.CarCategoryDto;
import kg.megacom.RendAvto.servise.CarCateServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarCateServiseImpl implements CarCateServise {
    @Autowired
    private CarCategoryRepo carCategoryRepo;
    @Override
    public CarCategoryDto saveCarCategory(CarCategoryDto carCategory) {
        CarCategory carCategory1 = CarCategoryMapper.INSTANCE.carCategoryDtoToCarCategory(carCategory);
        carCategory1 = carCategoryRepo.save(carCategory1);
        return CarCategoryMapper.INSTANCE.carCategoryToCarCategoryDto(carCategory1);
    }
}
