package kg.megacom.RendAvto.models.dto;

import kg.megacom.RendAvto.models.Order;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class OrderDataDto {
    private Long id;
    private int action;
    private Date start;
    private Date end;
    private Boolean ended;
    private Float price;
    //DTO
    private OrderDto orderDto;
}
