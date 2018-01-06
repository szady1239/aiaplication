package pl.pkowalczyk.carparts.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pkowalczyk.carparts.demo.model.Part;

import java.util.List;

public interface PartRepository extends JpaRepository<Part,Long> {

    List<Part> findByName(String name);
    Part findByCode(Long code);
}
