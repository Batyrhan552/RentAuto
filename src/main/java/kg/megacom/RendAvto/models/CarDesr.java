package kg.megacom.RendAvto.models;

import kg.megacom.RendAvto.models.objects.CarData;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor

public class CarDesr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carDesr_Id")
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
