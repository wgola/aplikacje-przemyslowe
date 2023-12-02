package com.stepik.zad3;

import com.stepik.zad3.validators.PostalCode;
import com.stepik.zad3.validators.Wage;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
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
    @PostalCode
    private String postalCode;

    @NotNull(message = "Wage is required")
    @Wage
    private int wage;

    @AssertTrue(message = "You have to accept the conditions")
    private boolean termsAndConditions;
}
