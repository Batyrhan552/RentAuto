package kg.megacom.RendAvto.servise;

import kg.megacom.RendAvto.models.RentPrice;
import kg.megacom.RendAvto.models.dto.RentPriceDto;

import java.util.List;

public interface RentPriceService {
    List<RentPriceDto> findAll();
   RentPriceDto update(RentPriceDto rentPriceDto);
    RentPriceDto saveRentPrice(RentPriceDto rentPrice);
}
