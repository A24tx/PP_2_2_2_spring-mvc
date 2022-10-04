package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component("list")
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
    public void addCarFromFields(String model, int series, int year) {
        Car c = new Car(model, series, year);
        list.add(c);
    }

    @Override
    public void clearCars() {
        list.clear();
    }

    @Override
    public void addTestCars() {
        clearCars();

        list.add(new Car("toyota raw 4", 223, 2012));
        list.add(new Car("ваз 2106", 3, 1996));
        list.add(new Car("some car", 7773, 9999));
        list.add(new Car("range rover sport", 58, 2022));
        list.add(new Car("какая-то машина", 388, 2001));
    }
}
