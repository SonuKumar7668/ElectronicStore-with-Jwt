package com.electronic.Validate;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ImageNameValidator.class)
public @interface ImageNameValid {

    // error message
    String message() default "Invalid Image Name";

    // represents group og constants
    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
