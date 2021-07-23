package kg.megacom.RendAvto.servise;

import kg.megacom.RendAvto.models.Order;
import kg.megacom.RendAvto.models.dto.OrderDto;
import kg.megacom.RendAvto.models.objects.CarData;

import java.util.List;

public interface OrderServise {
    OrderDto saveOrder(CarData carData);
    List<OrderDto> findAll();
    OrderDto update(Long id,CarData carData);
    Order delete(Long id);

}
