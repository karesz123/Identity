package org.identity.validator;

import org.identity.dto.PersonDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.regex.Pattern;


@Component
public class PersonValidator implements Validator {

    private final Pattern PATTERN_EMAIL = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
    private final Pattern PATTERN_PHONE = Pattern.compile(
            "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$"
            + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$"
            + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$");

    @Override
    public boolean supports(Class<?> clazz) {
        return PersonDto.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        PersonDto personDto = (PersonDto) target;

        if (personDto.getPhones().isEmpty() && personDto.getEmails().isEmpty()) {
            errors.rejectValue("emails and phones", "Emails and phones are empty");
        }
    }
}
