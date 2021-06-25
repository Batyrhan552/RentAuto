package kg.megacom.RendAvto.models;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   @Column(name = "client_id")
//    @Setter(AccessLevel.PROTECTED)

    private String firstName;

    private String lastName;

    private String phoneNum;

    private String email;


}
