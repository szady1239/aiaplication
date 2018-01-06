package pl.pkowalczyk.carparts.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pkowalczyk.carparts.demo.model.Car;
import pl.pkowalczyk.carparts.demo.model.PartGroup;
import pl.pkowalczyk.carparts.demo.repository.PartGroupRepository;

import java.util.LinkedList;
import java.util.List;
@Service
public class PartGroupServiceImpl implements PartGroupService {
    @Autowired
    private CarService carService;
    @Autowired
    private PartGroupRepository partGroupRepository;

    @Override
    public List<PartGroup> getPartGroupByCar(Long carId) {
        Car car = carService.getCarById(carId);
        List<PartGroup> partGroups= partGroupRepository.findAll();
        List<PartGroup> partGroupsById = new LinkedList<PartGroup>();
        for (PartGroup part: partGroups
             ) {
            if(part.getCar().getId()==car.getId()){
                partGroupsById.add(part);
            }
        }
        return partGroupsById;
    }
}
