package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

@Controller
public class CarController {

    private CarService carservice;

    public CarController(CarService cs) {
        this.carservice = cs;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam int count, ModelMap model) {
        addTestCars();
        model.addAttribute("cars", carservice.getCars(count));
        return "cars";
    }

    private void addTestCars() {
        carservice.clearCars();

        carservice.addCar("toyota raw 4", 223, 2012);
        carservice.addCar("ваз 2106", 3, 1996);
        carservice.addCar("some car", 7773, 9999);
        carservice.addCar("range rover sport", 58, 2022);
        carservice.addCar("какая-то машина", 388, 2001);
    }

}