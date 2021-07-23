package kg.megacom.RendAvto.servise.impl;

import kg.megacom.RendAvto.dao.repository.RentPriceRepo;
import kg.megacom.RendAvto.mappers.ClientMapper;
import kg.megacom.RendAvto.mappers.RentPriceMapper;
import kg.megacom.RendAvto.models.Client;
import kg.megacom.RendAvto.models.RentPrice;
import kg.megacom.RendAvto.models.dto.RentPriceDto;
import kg.megacom.RendAvto.servise.RentPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentPriceServiceImpl implements RentPriceService {
    @Autowired
    private RentPriceRepo rentPriceRepo;

    @Override
    public List<RentPriceDto> findAll() {
        List<RentPrice> rentPriceList = rentPriceRepo.findAll();
        return RentPriceMapper.INSTANCE.rentPriceListToRentPriceToList(rentPriceList);
    }

    @Override
    public RentPriceDto update(RentPriceDto rentPriceDto) {
        RentPrice rentPrice = rentPriceRepo.findById(rentPriceDto.getId()).orElse(null);
        RentPriceDto rentPriceDto1 = RentPriceMapper.INSTANCE.renPriceToRentPriceDto(rentPrice);
        if (rentPrice == null) {
            throw new RuntimeException("Not found");
        }
        rentPriceDto1.setPrice(rentPriceDto.getPrice());
        RentPrice rentPriceUpdate = RentPriceMapper.INSTANCE.rentPriceDtoToRentPrice(rentPriceDto1);
        rentPriceUpdate = rentPriceRepo.save(rentPriceUpdate);
        return RentPriceMapper.INSTANCE.renPriceToRentPriceDto(rentPriceUpdate);
    }

    @Override
    public RentPriceDto saveRentPrice(RentPriceDto rentPrice) {
        RentPrice rentPrice1 = RentPriceMapper.INSTANCE.rentPriceDtoToRentPrice(rentPrice);
        rentPrice1 = rentPriceRepo.save(rentPrice1);
        return RentPriceMapper.INSTANCE.renPriceToRentPriceDto(rentPrice1);
    }


}
