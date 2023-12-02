package com.stepik.zad3.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PostalCodeValidator.class)
public @interface PostalCode {

    String message() default "Provide postal code with format: xx-xxx";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
