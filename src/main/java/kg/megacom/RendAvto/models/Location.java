package kg.megacom.RendAvto.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "location_id")
    private Long id;
    private String name;
}
