package com.app.presentation.controller;

import com.app.presentation.dto.PersonDTO;
import com.app.service.interfaces.IPersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/persons")
@AllArgsConstructor
public class PersonRestController {
    private final IPersonService personService;

    @GetMapping
    public ResponseEntity<List<PersonDTO>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(this.personService.getAll());
    }
}
