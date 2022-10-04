package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component("carService")
public abstract class CarService {
    abstract public List<Car> getCars(int max);

    abstract public void addCar(Car car);

    abstract public void addCarFromFields(String model, int series, int year);

    abstract public void clearCars();

    abstract public void addTestCars();
}
