package com.app.service.interfaces;

import com.app.presentation.dto.PersonDTO;

import java.util.List;

public interface IPersonService {
    List<PersonDTO> getAll();
}
