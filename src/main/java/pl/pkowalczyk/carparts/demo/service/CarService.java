package pl.pkowalczyk.carparts.demo.service;

import pl.pkowalczyk.carparts.demo.model.Car;

import java.util.List;

public interface CarService {
    Car getCarById(Long id);
    List<Car> getAllCars();
}
