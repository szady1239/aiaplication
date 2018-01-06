package pl.pkowalczyk.carparts.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.pkowalczyk.carparts.demo.model.PartGroup;
import pl.pkowalczyk.carparts.demo.service.PartGroupService;

import java.util.List;

@RestController
public class PartGroupControler {

    @Autowired
    PartGroupService partGroupService;

    @GetMapping("/findPartGroupByCar/{car}")
    public List<PartGroup> getPartGroupByCarId(@PathVariable(value = "car") Long carId) {


        return partGroupService.getPartGroupByCar(carId);
    }

}
