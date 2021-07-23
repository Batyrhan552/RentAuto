package kg.megacom.RendAvto.models.dto;

import lombok.Data;

@Data
public class CarDesrDto {
    private Long id;
    private String fuel;
    private String transmissions;

    private String side;

    private String typeOfDrive;
    private Double fuelConsumption;

    private String lang;
}
