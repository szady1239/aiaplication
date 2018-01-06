package pl.pkowalczyk.carparts.demo.service;

import pl.pkowalczyk.carparts.demo.model.Order;

import java.util.List;

public interface OrderService {
    Order orderGetById(Long id);
    Order orderSave(Long customerId);
    List<Order> getAllOrders();


}
