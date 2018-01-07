package pl.pkowalczyk.carparts.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pkowalczyk.carparts.demo.DemoApplication;
import pl.pkowalczyk.carparts.demo.model.Customer;
import pl.pkowalczyk.carparts.demo.model.Order;
import pl.pkowalczyk.carparts.demo.repository.CustomerRepository;
import pl.pkowalczyk.carparts.demo.repository.OrderRepository;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerRepository customerRepository;

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
    @Override
    public Order orderGetById(Long id) {
        return orderRepository.findOne(id);
    }

    @Override
    public Order orderSave(Long customerId) {
        Customer customer = customerService.getCustomerById(customerId);
//        Long id =1L;
//        Customer customer = customerRepository.findOne(id);
//        Customer customer = new Customer();
//        customer.setFirstName("Pafko");
//        customer.setLastName("Kowalczyk");
        Order order = new Order();
        order.setCustomer(customer);
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
