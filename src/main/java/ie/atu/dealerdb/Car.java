package ie.atu.dealerdb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String make;

    @NotBlank
    private String model;

    @NotBlank
    private String spec;

    @Min(1900)
    @Max(2024)
    private int regYear;

    @NotBlank
    private String reg;

    @Min(0)
    private int mileage;

    @NotBlank
    private String fuel;

    @NotBlank
    private String transmission;

    @Max(value = 10)
    private double engineSize;

    @NotBlank
    private String bodyType;

    @Min(2)
    @Max(9)
    private int seats;

    @Max(6)
    private int doors;

    @NotBlank
    private String colour;

    @Min(1)
    private int owners;

    @Min(3)
    @Max(24)
    private int warrantyMonths;

    @Min(0)
    private int price;

}