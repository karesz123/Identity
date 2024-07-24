package org.identity.service;

import lombok.RequiredArgsConstructor;
import org.identity.dto.PersonDto;
import org.identity.entity.PersonEntity;
import org.identity.repository.PersonRepository;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final ConversionService conversionService;

    public List<PersonDto> collectAllPersons() {
        List<PersonEntity> persons = personRepository.findAll();
        return persons.stream().map(personEntity -> conversionService.convert(PersonEntity.class, PersonDto.class)).toList();
    }
}
