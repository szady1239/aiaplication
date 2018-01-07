package pl.pkowalczyk.carparts.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.pkowalczyk.carparts.demo.model.Customer;
import pl.pkowalczyk.carparts.demo.service.CustomerService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerControler {
    @Autowired
    CustomerService customerService;

    @GetMapping("/findCustomerById/{id}")
    public Customer getCustomerById(@PathVariable(value = "id") Long id) {


        return customerService.getCustomerById(id);
    }
}
