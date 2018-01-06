package pl.pkowalczyk.carparts.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pkowalczyk.carparts.demo.model.PartGroup;

public interface PartGroupRepository extends JpaRepository<PartGroup,Long>{

}
