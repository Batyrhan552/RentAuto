package kg.megacom.RendAvto.Controllers;

import kg.megacom.RendAvto.models.Order;
import kg.megacom.RendAvto.servise.OrderServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderServise orderServise;

    @PostMapping("/saveOrder")
    public Order saveOrder(@RequestBody Order order){
        return orderServise.saveOrder(order);
    }
}
