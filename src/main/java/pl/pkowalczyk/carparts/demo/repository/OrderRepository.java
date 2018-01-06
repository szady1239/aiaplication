package pl.pkowalczyk.carparts.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pkowalczyk.carparts.demo.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
