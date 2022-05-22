package web.service;

import web.model.Car;

import java.util.Collection;

public interface CarsService {
    Collection<Car> getCarsByQuantity(Integer qtt);
}
