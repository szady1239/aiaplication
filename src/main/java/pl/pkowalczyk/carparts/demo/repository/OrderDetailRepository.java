package pl.pkowalczyk.carparts.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pkowalczyk.carparts.demo.model.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,Long> {
}
