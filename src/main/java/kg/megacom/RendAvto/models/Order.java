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

     @ManyToOne
     @JoinColumn(name = "id_client")
     private Client client;

     @ManyToOne
     @JoinColumn(name = "id_car")
     private Car car;

     @ManyToOne
     private Location pickUpLocation;
     private Date startDateRent;
     @ManyToOne
     private Location returnLocation;
     private Date endDateRent;
     private Double totalSum;
     private String clientComment;
     private Boolean active;

     public Order() {
     }
}


