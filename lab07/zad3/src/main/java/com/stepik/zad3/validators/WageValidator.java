package com.stepik.zad3.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class WageValidator implements ConstraintValidator<Wage, Integer> {

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value > 2000 && value < 3000;
    }
}
