package kg.megacom.RendAvto.mappers;

import kg.megacom.RendAvto.models.CarCategory;
import kg.megacom.RendAvto.models.CarDesr;
import kg.megacom.RendAvto.models.dto.CarCategoryDto;
import kg.megacom.RendAvto.models.dto.CarDesrDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CarDesrMapper {
    CarDesrMapper INSTANCE = Mappers.getMapper(CarDesrMapper.class);
    CarDesrDto carDesrToCarDesrDto(CarDesr carDesr);
    CarDesr carDesrDtoToCarDesr(CarDesrDto carDesrDto);
    List<CarDesrDto> carDesrListToCarDesrDtoList(List<CarDesr>carDesrList);
//    List<CarDesr>carDesrDtoListToCarDesrList(List<CarDesrDto>carDesrDtoList);
}
