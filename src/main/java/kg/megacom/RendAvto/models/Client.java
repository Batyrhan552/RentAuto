package kg.megacom.RendAvto.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//   @Column(name = "client_id")
//    @Setter(AccessLevel.PROTECTED)

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    @Column(name = "registration")
    @JsonIgnore
    private Date registrtrationDate;

    public Client() {
    }
}
