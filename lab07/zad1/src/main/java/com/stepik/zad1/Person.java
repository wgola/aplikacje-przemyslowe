package com.stepik.zad1;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Person {

    @NotNull(message = "Name is required")
    @Size(min = 2, message = "Name should start at least two characters")
    private String name;

    @NotNull(message = "Age is required")
    @Min(value = 0, message = "Age must be at least zero")
    private int age;

    @NotNull(message = "Postal code is required")
    @Pattern(regexp = "[0-9]{2}-[0-9]{3}", message = "Provide postal code with format: xx-xxx")
    private String postalCode;

    @NotNull(message = "Wage is required")
    @Min(value = 2000, message = "Minimum wage is 2000")
    @Max(value = 3000, message = "Maximum wage is 3000")
    private int wage;

    @AssertTrue(message = "You have to accept the conditions")
    private boolean termsAndConditions;
}
