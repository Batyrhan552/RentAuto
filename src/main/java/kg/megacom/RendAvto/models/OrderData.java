package kg.megacom.RendAvto.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data

@AllArgsConstructor
public class OrderData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int action;
    @Column(name = "timestampstart")
    private Date start;
    @Column(name = "timestampend")
    private Date end;

    private Boolean ended;
    private Float price;

    @ManyToOne
    @JoinColumn(name = "id_order")
    private Order order;

    public OrderData() {
    }
}

