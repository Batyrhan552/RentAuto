package kg.megacom.RendAvto.models.objects;

import kg.megacom.RendAvto.models.Location;
import kg.megacom.RendAvto.models.dto.LocationDto;
import lombok.Data;

import java.util.Date;

@Data
public class CarData {

    private Long carId;
    private Location pickup;
    private Location returnPlace;
    private Date pickUpDate;
    private Date returnDate;
    private String name;
    private String lastName;
    private String phoneNumber;
    private String email;
}
