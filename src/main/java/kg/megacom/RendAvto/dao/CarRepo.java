package kg.megacom.RendAvto.dao;

import kg.megacom.RendAvto.models.Car;
import kg.megacom.RendAvto.models.CarCategory;
import kg.megacom.RendAvto.models.Status;
import kg.megacom.RendAvto.models.dto.CarDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface  CarRepo extends JpaRepository<Car,Long> {

    @Query(value = "SELECT * FROM car c JOIN car_category cc ON c.carcategory_id = cc.id WHERE cc.category_name = ?1 ",
    nativeQuery = true)
    List<Car>findbyCategory (String categoryName);

    @Query(value = "select * from car c Join rent_price rp on c.rentprice_id=rp.id where rp.price = ?1",nativeQuery = true)
    List<Car>findbyPrice(Double price);

    @Query(value = "select * from car c where c.model = ?1", nativeQuery = true)
    List<Car> findbyModel(String model);

    @Query(value = "select * from car c where c.seats = ?1",nativeQuery = true )
    List<Car>findbySeats(Byte seats);

    @Query(value = "select * from car c where c.baggege = ?1",nativeQuery = true )
    List<Car>findbyBaggege(Byte baggege);

    @Query(value = "select * from car c where c.doors = ?1",nativeQuery = true )
    List<Car>findbyDoors(Byte doors);

//    @Query(value = "select * from car c where c.status = ?1",nativeQuery = true )
    List<Car>findByStatus(Status status);

    @Query(value = "select * from car c where c.rented = ?1",nativeQuery = true )
    List<Car>findByRented(Boolean rented);

    @Query(value = "SELECT * FROM car cr ORDER BY cr.carcategory_id",nativeQuery = true)
    List<Car>findAllByCAtegory();

//    List<Car> findByPriceOrderBy(Car car);

}
