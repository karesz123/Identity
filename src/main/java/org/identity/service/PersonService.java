package org.identity.service;

import lombok.RequiredArgsConstructor;
import org.identity.dto.PersonDto;
import org.identity.entity.PersonEntity;
import org.identity.mappers.PersonMapper;
import org.identity.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public List<PersonDto> collectAllPersons() {
        List<PersonEntity> persons = personRepository.findAll();
        return persons.stream()
                .map(personMapper::personToPersonDto)
                .toList();
    }
}
