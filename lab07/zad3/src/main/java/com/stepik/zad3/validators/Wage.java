package com.stepik.zad3.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = WageValidator.class)
public @interface Wage {

    String message() default "Provide wage between 2000 and 3000";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
