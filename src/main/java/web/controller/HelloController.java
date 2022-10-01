package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {


    @Autowired
    private CarService carservice;

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam int count, ModelMap model) {
        carservice.clearCars();

        carservice.addCar(new Car("toyota raw 4", 223, 2012));
        carservice.addCar(new Car("ваз 2106", 3, 1996));
        carservice.addCar(new Car("some car", 7773, 9999));
        carservice.addCar(new Car("range rover sport", 58, 2022));
        carservice.addCar(new Car("какая-то машина", 388, 2001));

        model.addAttribute("cars", carservice.getCars(count));
        return "cars";
    }

}