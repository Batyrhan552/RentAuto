package kg.megacom.RendAvto.models;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor

public class CarDesr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Setter(AccessLevel.PROTECTED)
//    @Column(name = "carDesr_id")

    private String fuel;
    private String transmissions;

    private String side;

    private String typeOfDrive;
    private Double fuelConsumption;

    private String lang;

    public CarDesr() {
    }
}
