package org.identity.service;

import lombok.RequiredArgsConstructor;
import org.identity.dto.PersonDto;
import org.identity.entity.PersonEntity;
import org.identity.repository.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final PasswordService passwordService;
    private final ModelMapper modelMapper;

    public List<PersonDto> collectAllPersons() {
        List<PersonEntity> persons = personRepository.findAll();
        return persons.stream().map(personEntity -> modelMapper.map(PersonEntity.class, PersonDto.class)).toList();
    }

    public void createPerson(PersonDto personDto) {
        PersonEntity person = modelMapper.map(personDto, PersonEntity.class);
        person.setPassword(passwordService.encode(person.getPassword()));
        personRepository.save(person);
    }
}
