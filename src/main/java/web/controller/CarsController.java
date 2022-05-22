package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsServiceImpl;

@Controller
public class CarsController {
    private final CarsServiceImpl carService;

    @Autowired
    public CarsController(CarsServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(
            @RequestParam(value = "qtt", required = false) Integer qtt,
            ModelMap model
    ) {
        model.addAttribute("cars", carService.getCarsByQuantity(qtt));
        return "cars";
    }
}
