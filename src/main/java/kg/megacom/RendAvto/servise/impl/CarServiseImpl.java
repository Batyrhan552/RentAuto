package kg.megacom.RendAvto.servise.impl;

import kg.megacom.RendAvto.dao.CarRepo;
import kg.megacom.RendAvto.models.Car;
import kg.megacom.RendAvto.servise.CarServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiseImpl implements CarServise {
    @Autowired
    private CarRepo carRepo;
    @Override
    public Car saveCar(Car car) {
        return carRepo.save(car);
    }
}
