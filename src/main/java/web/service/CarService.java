package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Component("carService")
public abstract class CarService {
    abstract public List<Car> getCars(int max);

    abstract public void addCar(Car car);
    abstract public void addCar(String model, int series, int year);
    abstract public void clearCars();
}
