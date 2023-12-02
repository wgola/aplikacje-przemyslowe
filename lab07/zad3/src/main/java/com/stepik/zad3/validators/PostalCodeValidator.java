package com.stepik.zad3.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PostalCodeValidator implements ConstraintValidator<PostalCode, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.matches("[0-9]{2}-[0-9]{3}");
    }
}
