package kg.megacom.RendAvto.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    private Boolean rented;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cardsr_id")

    private CarDesr carDesr;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rentprice_id")

    private RentPrice rentPrice;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "carcategory_id")
    private CarCategory carCategory;
}
