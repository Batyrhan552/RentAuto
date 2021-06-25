package kg.megacom.RendAvto.dao.repository;

import kg.megacom.RendAvto.models.CarDesr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDesrRepo extends JpaRepository<CarDesr,Long> {
}
