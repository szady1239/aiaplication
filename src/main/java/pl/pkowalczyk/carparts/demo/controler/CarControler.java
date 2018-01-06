package pl.pkowalczyk.carparts.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pkowalczyk.carparts.demo.model.Car;
import pl.pkowalczyk.carparts.demo.service.CarService;

import java.util.List;

@RestController
public class CarControler {
    @Autowired
    CarService carService;

    @GetMapping("/findAllCars")
    public List<Car> getAllCars(){
        return carService.getAllCars();
    };
}
