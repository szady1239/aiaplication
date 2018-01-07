package pl.pkowalczyk.carparts.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pkowalczyk.carparts.demo.model.Customer;
import pl.pkowalczyk.carparts.demo.model.Order;
import pl.pkowalczyk.carparts.demo.repository.OrderRepository;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    CustomerService customerService;


    @Override
    public Order orderGetById(Long id) {
        return orderRepository.findOne(id);
    }

    @Override
    public Order orderSave(Long customerId) {
        Customer customer = customerService.getCustomerById(customerId);
        System.out.println(customer.toString());
        Order order = new Order();
        order.setCustomer(customer);
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
