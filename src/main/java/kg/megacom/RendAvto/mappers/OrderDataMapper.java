package kg.megacom.RendAvto.mappers;

import kg.megacom.RendAvto.models.Car;
import kg.megacom.RendAvto.models.CarDesr;
import kg.megacom.RendAvto.models.OrderData;
import kg.megacom.RendAvto.models.dto.CarDto;
import kg.megacom.RendAvto.models.dto.OrderDataDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderDataMapper {
    OrderDataMapper INSTANCE = Mappers.getMapper(OrderDataMapper.class);
    OrderDataDto orderDataToOrderDataDto(OrderData orderData);
    OrderData OrderDataDtoToOrderData(OrderDataDto orderDataDto);
    List<OrderDataDto> orderDataListToOrderDataToList(List<OrderData>orderDataList);
    List<OrderData>orderDataDtoListToOrderDataList(List<OrderDataDto>orderDataDtoList);
}
