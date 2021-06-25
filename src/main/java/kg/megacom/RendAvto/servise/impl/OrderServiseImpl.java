package kg.megacom.RendAvto.servise.impl;

import kg.megacom.RendAvto.dao.repository.OrderRepo;
import kg.megacom.RendAvto.models.Order;
import kg.megacom.RendAvto.servise.OrderServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;

@Service
public class OrderServiseImpl implements OrderServise {
    @Autowired
    private OrderRepo orderRepo;
    @Override
    public Order saveOrder(Order order) {
        return orderRepo.save(order);
    }
}
