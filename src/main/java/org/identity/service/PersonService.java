package org.identity.service;

import com.googlecode.jmapper.JMapper;
import lombok.RequiredArgsConstructor;
import org.identity.dto.PersonDto;
import org.identity.entity.PersonEntity;
import org.identity.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;

    public List<PersonDto> collectAllPersons() {
        List<PersonEntity> persons = personRepository.findAll();
        JMapper<PersonDto, PersonEntity> personMapper = new JMapper<>(PersonDto.class, PersonEntity.class);
        return persons.stream().map(personMapper::getDestination).toList();
    }
}
