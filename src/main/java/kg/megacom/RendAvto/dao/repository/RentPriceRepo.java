package kg.megacom.RendAvto.dao.repository;

import kg.megacom.RendAvto.models.RentPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentPriceRepo extends JpaRepository<RentPrice,Long> {
}
