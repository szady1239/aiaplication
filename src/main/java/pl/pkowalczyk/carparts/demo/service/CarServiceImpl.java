package pl.pkowalczyk.carparts.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pkowalczyk.carparts.demo.model.Car;
import pl.pkowalczyk.carparts.demo.repository.CarRepository;

import java.util.List;

@Service
public class CarServiceImpl implements  CarService{
    @Autowired
    private CarRepository carRepository;

    @Override
    public Car getCarById(Long id) {
        return carRepository.findOne(id);
    }

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }
}
