package kg.megacom.RendAvto.Controllers;

import kg.megacom.RendAvto.models.Client;
import kg.megacom.RendAvto.models.dto.ClientDto;
import kg.megacom.RendAvto.servise.ClientServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {
    @Autowired
    private ClientServise clientServise;

    @PostMapping("/saveClient")
    public Client saveClient(@RequestBody Client client) {
        return clientServise.saveClient(client);
    }

    @GetMapping("/findbyEmail")
    public Client findbyEmail(@RequestParam String email) {
        return clientServise.finByEmail(email);

    }

    @GetMapping("/findbyFirstName")
    public List<Client> findbyFirstName(@RequestParam String firstName) {
        return clientServise.finByFirstName(firstName);
    }

    @GetMapping("/findbyLasttName")
    public List<Client> findbyLastName(@RequestParam String lastName) {
        return clientServise.finByLastName(lastName);
    }

    @GetMapping("/findbyPhoneNumber")
    public List<Client> findbyPhoneNumber(@RequestParam String phoneNumber) {
        return clientServise.finByPhoneNumber(phoneNumber);
    }

    @GetMapping("findAl")
    public List<Client> findAll() {
        return clientServise.findAll();
    }

    @GetMapping("/findById")
    public ClientDto findById(@RequestParam Long id) {
        return clientServise.findById(id);
    }

    @PutMapping("/update/{id}")
    public ClientDto update(@PathVariable Long id, @RequestBody ClientDto clientDto){
        return clientServise.update(id,clientDto);
    }
    @DeleteMapping("/delete")
    public ClientDto delete(@RequestParam Long id){
        return clientServise.delete(id);
    }
}
