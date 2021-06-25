package kg.megacom.RendAvto.servise.impl;

import kg.megacom.RendAvto.dao.repository.CarCategoryRepo;
import kg.megacom.RendAvto.models.CarCategory;
import kg.megacom.RendAvto.servise.CarCateServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarCateServiseImpl implements CarCateServise {
    @Autowired
    private CarCategoryRepo carCategoryRepo;
    @Override
    public CarCategory saveCarCategory(CarCategory carCategory) {
        return carCategoryRepo.save(carCategory);
    }
}
