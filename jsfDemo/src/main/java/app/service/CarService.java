package app.service;

import app.domain.serviceModels.CarServiceModel;

import java.util.List;

public interface CarService {

    void saveCar(CarServiceModel carServiceModel);
    List<CarServiceModel> allCars();
}
