package org.identity.controller;

import lombok.RequiredArgsConstructor;
import org.identity.dto.PersonDto;
import org.identity.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class PersonController {

    private final PersonService personService;

    @GetMapping("/persons")
    public ResponseEntity<List<PersonDto>> getAllPersons() {
        return ResponseEntity.of(
                Optional.of(personService.collectAllPersons()));
    }
}
