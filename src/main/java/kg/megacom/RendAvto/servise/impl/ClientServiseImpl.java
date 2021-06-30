package kg.megacom.RendAvto.servise.impl;

import kg.megacom.RendAvto.dao.repository.ClientRepo;
import kg.megacom.RendAvto.models.Client;
import kg.megacom.RendAvto.servise.ClientServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ClientServiseImpl implements ClientServise {
    @Autowired
    private ClientRepo clientRepo;
    @Override
    public Client saveClient(Client client) {
        Date date =new Date();
        client.setRegistrtrationDate(date);
        return clientRepo.save(client);
    }

    @Override
    public List<Client> finByEmail(String email) {
        return clientRepo.findByEmail(email);
    }

    @Override
    public List<Client> finByPhoneNumber(String phoneNumber) {
        return clientRepo.findByPhoneNumber(phoneNumber);
    }

    @Override
    public List<Client> finByFirstName(String firstName) {
        return clientRepo.findByFirstName(firstName);
    }

    @Override
    public List<Client> finByLastName(String lastName) {
        return clientRepo.findByLastName(lastName);
    }
}
