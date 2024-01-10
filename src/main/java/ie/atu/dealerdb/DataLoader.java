package ie.atu.dealerdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final CarRepository carRepository;

    @Autowired
    public DataLoader(CarRepository carRepository) { this.carRepository = carRepository; }

    @Override
    public void run (String... args) throws Exception {
        Car testData = new Car(1L, "Toyota", "Prius", "Business Edition", 2015, "151D2222", 230339, "Hybrid", "Automatic", 1.8, "Hatchback", 5, 5, "Silver", 2, 12, 12000);
        Car testData2 = new Car(2L, "Volkswagen", "Golf", "1.6 TDI Match", 2011, "11G12860", 260112, "Diesel", "Manual", 1.6, "Hatchback", 5, 5, "Red", 6, 3, 6000);
        Car testData3 = new Car(3L, "Volkswagen", "Golf", "2.0 TDI R-Line Panroof", 2016, "162KE4409", 80095, "Diesel", "Manual", 2.0, "Hatchback", 5, 5, "Grey", 2, 12, 14000);
        Car testData4 = new Car(4L, "Opel", "Corsa", "1.0 Turbo SRi", 2019, "191G123", 44000, "Petrol", "Manual", 1.0, "Hatchback", 5, 3, "Green", 1, 24, 13000);
        Car testData5 = new Car(5L, "Volkswagen", "Passat", "2.0 TDI Highline DSG", 2018, "181C3308", 100329, "Diesel", "Automatic", 2.0, "Saloon", 5, 4, "Black", 2, 24, 18500);
        Car testData6 = new Car(6L, "Skoda", "Octavia", "2.0 TDI vRS", 2012, "12G44", 330999, "Diesel", "Manual", 2.0, "Estate", 5, 5, "Blue", 4, 3, 6500);
        Car testData7= new Car(7L, "Audi", "A4", "2.0 TDI S-line Quattro", 2014, "141D12409", 190884, "Diesel", "Manual", 2.0, "Saloon", 5, 4, "White", 4, 12, 12500);
        Car testData8 = new Car(8L, "Ford", "Galaxy", "2.0 TDCi Titanium X", 2016, "162G1140", 30339, "Diesel", "Manual", 2.0, "MPV", 7, 5, "Orange", 2, 12, 16500);
        Car testData9 = new Car(9L, "Toyota", "Corolla", "1.6 Luna Auto", 2005, "05LD5", 14504, "Petrol", "Automatic", 1.6, "Saloon", 5, 4, "Silver", 1, 3, 3600);
        carRepository.save(testData);
        carRepository.save(testData2);
        carRepository.save(testData3);
        carRepository.save(testData4);
        carRepository.save(testData5);
        carRepository.save(testData6);
        carRepository.save(testData7);
        carRepository.save(testData8);
        carRepository.save(testData9);

    }
}