package kg.megacom.RendAvto.mappers;

import kg.megacom.RendAvto.models.Car;
import kg.megacom.RendAvto.models.RentPrice;
import kg.megacom.RendAvto.models.dto.CarDto;
import kg.megacom.RendAvto.models.dto.RentPriceDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RentPriceMapper {
    RentPriceMapper INSTANCE = Mappers.getMapper(RentPriceMapper.class);
    RentPriceDto renPriceToRentPriceDto(RentPrice rentPrice);
   RentPrice rentPriceDtoToRentPrice(RentPriceDto rentPriceDto);
    List<RentPriceDto> rentPriceListToRentPriceToList(List<RentPrice>rentPrices);
    List<RentPrice>rentPriceDtoListToRentPriceList(List<RentPriceDto>rentPriceDtos);
}
