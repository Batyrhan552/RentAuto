package kg.megacom.RendAvto.servise;

import kg.megacom.RendAvto.models.CarDesr;
import kg.megacom.RendAvto.models.dto.CarDesrDto;

public interface CarDesrServise {
    CarDesrDto saveCarDesr(CarDesrDto carDesr);
}
