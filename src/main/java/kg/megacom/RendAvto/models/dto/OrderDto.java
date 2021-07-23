package kg.megacom.RendAvto.models.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class OrderDto {
    private Long id;
    private LocationDto pickUpLocation;
    private Date startDateRent;
    private LocationDto returnLocation;
    private Date endDateRent;
    private Double totalSum;
    private String clientComment;
    private Boolean active;

    //DTO
    private ClientDto client;
    private CarDto car;

}
