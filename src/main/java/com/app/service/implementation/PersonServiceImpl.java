package com.app.service.implementation;

import com.app.persistence.entity.PersonEntity;
import com.app.persistence.repository.IPersonCrudRepository;
import com.app.presentation.dto.PersonDTO;
import com.app.service.interfaces.IPersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements IPersonService {
    private final IPersonCrudRepository personRepository;


    @Override
    public List<PersonDTO> getAll() {
        return ((List<PersonEntity>) personRepository.findAll()).stream().map(personEntity ->
                    PersonDTO.builder()
                            .age(personEntity.getAge())
                            .id(personEntity.getId())
                            .lastName(personEntity.getLastName())
                            .name(personEntity.getName())
                            .build()

                ).toList();
    }
}
