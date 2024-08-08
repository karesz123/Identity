package org.identity.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {PersonsContactsValidator.class})
public @interface PersonsContacts {

    String message() default "The persons contacts are empty: email addresses and phone numbers are both empty";

    Class<?> [] groups() default{};
    Class<? extends Payload>[] payload() default{};
}
