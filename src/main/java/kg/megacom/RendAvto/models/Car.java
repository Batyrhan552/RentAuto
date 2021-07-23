package kg.megacom.RendAvto.models;

//import kg.megacom.RendAvto.models.objects.CarData;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carId")
    private Long id;
//    @Column(name = "car_id")
//    @Setter(AccessLevel.PROTECTED)
    @Enumerated(EnumType.STRING)
    private Status status;

    private String model;

    private Integer year;

    private Byte seats;

    private Byte baggage;

    private Byte doors;

    private Boolean active;


    @OneToOne
    @JoinColumn(name = "cardsr_id")
    private CarDesr carDesr;

    @ManyToOne
    @JoinColumn(name = "rentprice_id")
    private RentPrice rentPrice;

    @ManyToOne
    @JoinColumn(name = "carcategory_id")
    private CarCategory carCategory;
}
