package kg.megacom.RendAvto.models;

import kg.megacom.RendAvto.models.objects.CarData;
import lombok.*;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor

public class RentPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "rentPrice_id")
//    @Setter(AccessLevel.PROTECTED)
    @Column(name = "rentPriceId")
    private Long id;
    private Double price;


    public RentPrice() {
    }
}
