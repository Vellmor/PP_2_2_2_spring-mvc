package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class CarsServiceImpl implements CarsService {
    private final Collection<Car> cars = Arrays.asList(
            new Car("Porsche", "red", 280),
            new Car("Lamborghini", "brown", 300),
            new Car("Alfa Romeo", "black", 250),
            new Car("Honda", "white", 220),
            new Car("Toyota", "yellow", 200)
    );

    @Override
    public Collection<Car> getCarsByQuantity(Integer qtt) {
        if (qtt == null) {
            return cars;
        } else {
            return cars.stream().limit(qtt).collect(Collectors.toList());
        }
    }
}
