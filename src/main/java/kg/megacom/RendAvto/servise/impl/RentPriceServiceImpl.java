package kg.megacom.RendAvto.servise.impl;

import kg.megacom.RendAvto.dao.repository.RentPriceRepo;
import kg.megacom.RendAvto.models.RentPrice;
import kg.megacom.RendAvto.servise.RentPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentPriceServiceImpl implements RentPriceService {
    @Autowired
    private RentPriceRepo rentPriceRepo;
    @Override
    public RentPrice saveRentPrice(RentPrice rentPrice) {
        return rentPriceRepo.save(rentPrice);
    }


}
