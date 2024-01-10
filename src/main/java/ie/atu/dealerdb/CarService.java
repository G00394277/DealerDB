package ie.atu.dealerdb;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepo;

    public CarService(CarRepository carRepo) {
        this.carRepo = carRepo;
    }

    public void saveCar(Car car) {
        carRepo.save(car);
    }

    public Car getCarByReg(String reg) {
        return carRepo.findByReg(reg);
    }

    public List<Car> getAllCars() {
        return carRepo.findAll();
    }

    public List<Car> getCarsByMake(String make) {
        return carRepo.findByMake(make);
    }
}