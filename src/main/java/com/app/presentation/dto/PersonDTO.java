package com.app.presentation.dto;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDTO {
    private Long id;
    private String name;
    private String lastName;
    private Integer age;
    private String email;
}
