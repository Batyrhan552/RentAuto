package kg.megacom.RendAvto.models;

import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor

public class RentPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "rentPrice_id")
//    @Setter(AccessLevel.PROTECTED)
    private Long id;

    private BigDecimal price;

    public RentPrice() {
    }
}
