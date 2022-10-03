package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component("carService")
public class CarServiceImpl extends CarService {

    private List<Car> list = new ArrayList<>();

    @Override
    public List<Car> getCars(int max) {
        if (max > 5 || max > list.size()) {
            return list.subList(0, list.size());
        } else {
            return list.subList(0, max);
        }

    }

    @Override
    public void addCar(Car car) {
        list.add(car);
    }

    @Override
    public void addCar(String model, int series, int year) {
        Car c = new Car(model, series, year);
        list.add(c);
    }

    @Override
    public void clearCars() {
        list.clear();
    }
}
