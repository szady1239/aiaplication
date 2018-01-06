package pl.pkowalczyk.carparts.demo.service;

import pl.pkowalczyk.carparts.demo.model.Customer;

public interface CustomerService {
    Customer getCustomerById(Long id);
}
