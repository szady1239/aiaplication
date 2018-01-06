package pl.pkowalczyk.carparts.demo.service;

import pl.pkowalczyk.carparts.demo.model.Car;
import pl.pkowalczyk.carparts.demo.model.PartGroup;

import java.util.List;

public interface PartGroupService {
    List<PartGroup> getPartGroupByCar(Long carId);
}
