package org.identity.controller;

import lombok.RequiredArgsConstructor;
import org.identity.dto.PersonDto;
import org.identity.service.PersonService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/identity")
public class PersonController {

    public final String DEFAULT_SORTING_PROPERTY = "firstName";
    private final int DEFAULT_PAGING_PAGE_NUMBER = 0;
    private final int DEFAULT_PAGING_SIZE = 20;

    private final PersonService personService;

    @PostMapping(path = "/create-person")
    public ResponseEntity<?> createPerson(@RequestBody PersonDto personDto) {
        PersonDto createdPersonDto = personService.createPerson(personDto);
        return ResponseEntity.of(Optional.of(createdPersonDto));
    }

    @GetMapping(path = "/persons")
    public ResponseEntity<List<PersonDto>> getAllPersons(
            @PageableDefault(page = DEFAULT_PAGING_PAGE_NUMBER, size = DEFAULT_PAGING_SIZE)
            @SortDefault(sort = DEFAULT_SORTING_PROPERTY, direction = Sort.Direction.ASC)
            Pageable pageable) {
        return ResponseEntity.of(
                Optional.of(personService.collectAllPersons(pageable)));
    }
}
