package kg.megacom.RendAvto.dao;

import kg.megacom.RendAvto.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  CarRepo extends JpaRepository<Car,Long> {
}
