package kg.megacom.RendAvto.mappers;

import kg.megacom.RendAvto.models.Order;
import kg.megacom.RendAvto.models.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    OrderDto orderToOrderDto(Order order);
    Order orderDtoToOrder(OrderDto orderDto);
    List<OrderDto> orderListToOrderToList(List<Order>orderList);
    List<Order>orderDtoListToOrderList(List<OrderDto>orderDtoList);
}
