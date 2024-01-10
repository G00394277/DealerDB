package ie.atu.dealerdb;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByReg(String reg);

    List<Car> findByMake(String make);
}