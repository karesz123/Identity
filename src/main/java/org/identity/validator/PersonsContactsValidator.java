package org.identity.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.identity.dto.PersonDto;
import org.springframework.stereotype.Component;


@Component
public class PersonsContactsValidator implements ConstraintValidator<PersonsContacts, PersonDto> {

    @Override
    public boolean isValid(PersonDto personDto, ConstraintValidatorContext constraintValidatorContext) {
        return !personDto.getPhones().isEmpty() || !personDto.getEmails().isEmpty();
    }
}
