package kg.megacom.RendAvto.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
public class Order {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
     @JoinColumn(name = "id_client")
     private Client client;

     @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
     @JoinColumn(name = "id_car")
     private Car car;

     private String pickUpLocation;
     private Date startDateRent;
     private String returnLocation;
     private Date endDateRent;
     private BigDecimal totalSum;
     private String clientComment;

     public Order() {
     }
}


