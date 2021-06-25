package kg.megacom.RendAvto.dao.repository;

import kg.megacom.RendAvto.models.CarCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarCategoryRepo extends JpaRepository<CarCategory,Long> {
}
