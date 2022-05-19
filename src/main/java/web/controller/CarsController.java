package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Porshe", "red", 350));
        model.addAttribute("cars", cars);
        return "cars";
    }
}
