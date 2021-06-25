package kg.megacom.RendAvto.servise.impl;

import kg.megacom.RendAvto.dao.repository.ClientRepo;
import kg.megacom.RendAvto.models.Client;
import kg.megacom.RendAvto.servise.ClientServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiseImpl implements ClientServise {
    @Autowired
    private ClientRepo clientRepo;
    @Override
    public Client saveClient(Client client) {
        return clientRepo.save(client);
    }
}
