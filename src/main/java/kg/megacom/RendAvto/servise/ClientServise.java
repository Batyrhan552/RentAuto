package kg.megacom.RendAvto.servise;

import kg.megacom.RendAvto.models.Client;
import kg.megacom.RendAvto.models.dto.ClientDto;

import java.util.List;

public interface ClientServise {
    Client saveClient(Client client);
    ClientDto findById(Long id);
    List<Client> findAll();
    ClientDto delete(Long active);
    Client finByEmail(String email);
   List<Client>finByPhoneNumber(String phoneNumber);
   List<Client>finByFirstName(String firstName);
   List<Client>finByLastName(String lasttName);
   ClientDto update(Long id ,ClientDto clientDto);
}
