package kg.megacom.RendAvto.servise.impl;

import kg.megacom.RendAvto.dao.repository.ClientRepo;
import kg.megacom.RendAvto.mappers.ClientMapper;
import kg.megacom.RendAvto.models.Car;
import kg.megacom.RendAvto.models.Client;
import kg.megacom.RendAvto.models.dto.ClientDto;
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
    public ClientDto findById(Long id) {
        Client client = clientRepo.findById(id).orElse(null);
        System.out.println(client);
        if(client == null){
            throw new RuntimeException("Not found");
        }
       return ClientMapper.INSTANCE.clientToClientDto(client);
    }


    @Override
    public List<Client> findAll() {
        return clientRepo.findAll();
    }

    @Override
    public ClientDto delete(Long id) {
        if (clientRepo.existsById(id)){
            Client client = clientRepo.findById(id).get();

            client.setActive(false);
            client = clientRepo.save(client);
            return  ClientMapper.INSTANCE.clientToClientDto(client);

        }
        throw new RuntimeException("Client by id not found!");
    }



    @Override
    public Client finByEmail(String email) {
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

    @Override
    public ClientDto update(Long id,ClientDto clientDto) {
        Client client = clientRepo.findById(clientDto.getId()).orElse(null);
        ClientDto clientDto1 = ClientMapper.INSTANCE.clientToClientDto(client);
        if (client == null) {
            throw new RuntimeException("Not found");
        }
            clientDto1.setEmail(clientDto.getEmail());
            clientDto1.setFirstName(clientDto.getFirstName());
            clientDto1.setLastName(clientDto.getLastName());
            clientDto1.setPhoneNumber(clientDto.getPhoneNumber());
            Client clientUpdate = ClientMapper.INSTANCE.clientDtoToClient(clientDto1);
            clientUpdate = clientRepo.save(clientUpdate);
            return ClientMapper.INSTANCE.clientToClientDto(clientUpdate);
        }

    }

