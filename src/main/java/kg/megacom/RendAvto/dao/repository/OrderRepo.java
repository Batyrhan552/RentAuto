package kg.megacom.RendAvto.dao.repository;

import kg.megacom.RendAvto.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order,Long> {
}
