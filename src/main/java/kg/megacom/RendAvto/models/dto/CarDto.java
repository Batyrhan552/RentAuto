package kg.megacom.RendAvto.models.dto;

import kg.megacom.RendAvto.models.CarCategory;
import kg.megacom.RendAvto.models.CarDesr;
import kg.megacom.RendAvto.models.RentPrice;
import kg.megacom.RendAvto.models.Status;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class CarDto {
    private Long id;

    private Status status;

    private String model;

    private Integer year;

    private Byte seats;

    private Byte baggage;

    private Byte doors;

    private Boolean active;
    //DTO
    private CarDesrDto carDesr;

    private RentPriceDto rentPrice;

    private CarCategoryDto carCategory;
}
