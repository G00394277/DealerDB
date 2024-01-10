package ie.atu.dealerdb;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/car")
@RestController
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/findByReg/{reg}")
    public ResponseEntity<?> getCar(@PathVariable String reg) {

        if (reg.length() < 4 || reg.isBlank()) {
            return ResponseEntity.badRequest().body("Registration is invalid");
        }

        Car car = carService.getCarByReg(reg);

        if (car == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(car);
    }

    @GetMapping("/findByMake/{make}")
    public ResponseEntity<?> getCarsByMake(@PathVariable String make) {
        List<Car> cars = carService.getCarsByMake(make);
        if (cars.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cars);
    }

    @GetMapping("/findAllCars")
    public ResponseEntity<?> getAllPersons() {

        List<Car> cars = carService.getAllCars();

        if (cars == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(cars);
    }
    @PostMapping("/addCar")
    public ResponseEntity<String>create(@Valid @RequestBody Car car) {
        carService.saveCar(car);
        return new ResponseEntity<>("Car added successfully", HttpStatus.OK);
    }
}