package kg.megacom.RendAvto.servise;

import kg.megacom.RendAvto.models.Client;

import java.util.List;

public interface ClientServise {
    Client saveClient(Client client);
   List<Client>finByEmail(String email);
   List<Client>finByPhoneNumber(String phoneNumber);
   List<Client>finByFirstName(String firstName);
   List<Client>finByLastName(String lasttName);
}
