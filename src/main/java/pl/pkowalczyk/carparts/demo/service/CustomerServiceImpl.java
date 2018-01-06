package pl.pkowalczyk.carparts.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pkowalczyk.carparts.demo.model.Customer;
import pl.pkowalczyk.carparts.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements  CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findByid(id);
    }
}
