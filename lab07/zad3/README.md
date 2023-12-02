### _Zadanie 3_

Aby utworzyć własny walidator należy zdefiniować interfejs oraz odpowiednią do niej klasę.

Przykład:

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AdultValidator.class)
public @interface Adult {

    String message() default "Nie jest pełnoletni(a)";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
```

```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AdultValidator implements ConstraintValidator<Adult, Date> {

    @Override
    public boolean isValid(Date date, ConstraintValidatorContext constraintValidatorContext) {
        final LocalDate from = LocalDate.from(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        final LocalDate now = LocalDate.now();

        return now.minusYears(18).isAfter(from);

    }
}
```

Powyższy walidator o nazwie `@Adult` możemy wykorzystać następująco:

```java
@Adult
private Date dateOfBirth;
```

Wzorując się na pokazanym przykładzie napisz własne walidatory do pól kod pocztowy oraz zarobki.
