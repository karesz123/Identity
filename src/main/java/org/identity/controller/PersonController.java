package org.identity.controller;

import lombok.RequiredArgsConstructor;
import org.identity.dto.PersonDto;
import org.identity.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/identity")
public class PersonController {

    private final PersonService personService;

    @PostMapping(path = "/create-person")
    public ResponseEntity<?> createPerson(@RequestBody PersonDto personDto) {
        personService.createPerson(personDto);
        return ResponseEntity.of(Optional.empty());
    }

    @GetMapping(path = "/persons")
    public ResponseEntity<List<PersonDto>> getAllPersons() {
        return ResponseEntity.of(
                Optional.of(personService.collectAllPersons()));
    }
}
