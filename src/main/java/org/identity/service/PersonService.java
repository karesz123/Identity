package org.identity.service;

import lombok.RequiredArgsConstructor;
import org.identity.dto.PersonDto;
import org.identity.entity.PersonEntity;
import org.identity.repository.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final PasswordService passwordService;
    private final ModelMapper personEntityToPersonDtoMapper;
    private final ModelMapper personDtoToPersonEntityMapper;

    public List<PersonDto> collectAllPersons(Pageable pageable) {
        Page<PersonEntity> persons = personRepository.findAll(pageable);
        return persons.stream()
                .map(personEntity -> personEntityToPersonDtoMapper.map(PersonEntity.class, PersonDto.class))
                .toList();
    }

    public PersonDto createPerson(PersonDto personDto) {
        PersonEntity person = personDtoToPersonEntityMapper.map(personDto, PersonEntity.class);
        person.setPassword(passwordService.encode(person.getPassword()));
        PersonEntity flushedPersonEntity = personRepository.saveAndFlush(person);
        return personEntityToPersonDtoMapper.map(flushedPersonEntity, PersonDto.class);
    }
}
