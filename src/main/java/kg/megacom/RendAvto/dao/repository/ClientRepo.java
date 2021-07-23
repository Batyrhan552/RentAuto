package kg.megacom.RendAvto.dao.repository;

import kg.megacom.RendAvto.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepo extends JpaRepository<Client,Long> {
    Client findByEmail(String email);

    List<Client>findByPhoneNumber(String phoneNumber);

    List<Client>findByFirstName(String firstName);

    List<Client>findByLastName(String lastName);
}
