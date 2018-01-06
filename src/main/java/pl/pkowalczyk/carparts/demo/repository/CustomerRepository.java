package pl.pkowalczyk.carparts.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pkowalczyk.carparts.demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findByid(Long id);
}
