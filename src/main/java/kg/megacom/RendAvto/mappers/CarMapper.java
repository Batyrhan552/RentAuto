package kg.megacom.RendAvto.mappers;

import kg.megacom.RendAvto.models.Car;
import kg.megacom.RendAvto.models.dto.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
    CarDto carToCarDto(Car car);
    Car carDtoToCar(CarDto carDto);
    List<CarDto> carListToCarToList(List<Car>carList);
    List<Car>carDtoListToCarList(List<CarDto>carDtoList);
}
