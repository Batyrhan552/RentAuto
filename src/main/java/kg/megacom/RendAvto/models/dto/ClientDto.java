package kg.megacom.RendAvto.models.dto;

import lombok.Data;

@Data
public class ClientDto {
    private Long id;
    private String firstName;

    private String lastName;

    private String phoneNum;

    private String email;
}
