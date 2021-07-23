package kg.megacom.RendAvto.dao.repository;

import kg.megacom.RendAvto.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends JpaRepository<Location, Long> {
}
