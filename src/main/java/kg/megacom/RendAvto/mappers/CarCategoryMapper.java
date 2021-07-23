package kg.megacom.RendAvto.mappers;

import kg.megacom.RendAvto.models.CarCategory;
import kg.megacom.RendAvto.models.dto.CarCategoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CarCategoryMapper {
    CarCategoryMapper INSTANCE = Mappers.getMapper(CarCategoryMapper.class);
    CarCategoryDto carCategoryToCarCategoryDto(CarCategory carCategory);
    CarCategory carCategoryDtoToCarCategory(CarCategoryDto carCategoryDto);
    List<CarCategoryDto>carCategoryListToCarCategoryDtoList(List<CarCategory>carCategoryList);
    List<CarCategory>carCategoryDtoListToCarCategoryList(List<CarCategoryDto>carCategoryDtoList);




}
