package kg.megacom.RendAvto.servise.impl;

import kg.megacom.RendAvto.dao.repository.CarDesrRepo;
import kg.megacom.RendAvto.models.CarDesr;
import kg.megacom.RendAvto.servise.CarDesrServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarDesrServiseImpl implements CarDesrServise {
    @Autowired
    private CarDesrRepo carDesrRepo;
    @Override
    public CarDesr saveCarDesr(CarDesr carDesr) {
        return carDesrRepo.save(carDesr);
    }
}
