package kg.megacom.RendAvto.dao.repository;

import kg.megacom.RendAvto.models.CarCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarCategoryRepo extends JpaRepository<CarCategory,Long> {
}
