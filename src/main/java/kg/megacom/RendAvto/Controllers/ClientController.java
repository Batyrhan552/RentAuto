package kg.megacom.RendAvto.Controllers;

import kg.megacom.RendAvto.models.Client;
import kg.megacom.RendAvto.servise.ClientServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Autowired
   private ClientServise clientServise;

    @PostMapping("/saveClient")
    public Client saveClient(@RequestBody Client client){
        return clientServise.saveClient(client);
    }
}
