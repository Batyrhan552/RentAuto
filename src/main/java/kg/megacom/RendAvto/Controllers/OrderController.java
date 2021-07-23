package kg.megacom.RendAvto.Controllers;

import kg.megacom.RendAvto.models.Order;
import kg.megacom.RendAvto.models.dto.OrderDto;
import kg.megacom.RendAvto.models.objects.CarData;
import kg.megacom.RendAvto.servise.OrderServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    @Autowired
    private OrderServise orderServise;

    @PostMapping("/saveOrder")
    public OrderDto saveOrder(@RequestBody CarData carData){
        return orderServise.saveOrder(carData);
    }
    @GetMapping("/findAll")
    public List<OrderDto> findAll(){
        return orderServise.findAll();
    }
    @PutMapping("/update/{id}")
    public OrderDto update(@PathVariable Long id,@RequestBody CarData carData){
        return orderServise.update(id,carData);
    }
    @DeleteMapping("/delete/{id}")
    public Order delete(@PathVariable Long id){
        return orderServise.delete(id);
    }
}
