package kg.megacom.RendAvto.servise.impl;

import kg.megacom.RendAvto.dao.repository.CarDesrRepo;
import kg.megacom.RendAvto.mappers.CarDesrMapper;
import kg.megacom.RendAvto.models.CarDesr;
import kg.megacom.RendAvto.models.dto.CarDesrDto;
import kg.megacom.RendAvto.servise.CarDesrServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarDesrServiseImpl implements CarDesrServise {
    @Autowired
    private CarDesrRepo carDesrRepo;
    @Override
    public CarDesrDto saveCarDesr(CarDesrDto carDesr) {
        CarDesr carDesr1 = CarDesrMapper.INSTANCE.carDesrDtoToCarDesr(carDesr);
        carDesr1 = carDesrRepo.save(carDesr1);
        return CarDesrMapper.INSTANCE.carDesrToCarDesrDto(carDesr1);
    }
}
