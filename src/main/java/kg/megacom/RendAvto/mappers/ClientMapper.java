package kg.megacom.RendAvto.mappers;

import kg.megacom.RendAvto.models.Car;
import kg.megacom.RendAvto.models.CarDesr;
import kg.megacom.RendAvto.models.Client;
import kg.megacom.RendAvto.models.dto.CarDto;
import kg.megacom.RendAvto.models.dto.ClientDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClientMapper {
    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);
    ClientDto clientToClientDto(Client client);
    Client clientDtoToClient(ClientDto clientDto);
    List<ClientDto> clientListToClientToList(List<Client> clientList);
    List<Client>clientDtoListToClientList(List<ClientDto>clientDtoList);
}
