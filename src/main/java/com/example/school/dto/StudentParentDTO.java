package com.example.school.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentParentDTO {

    private ParentDTO parentDTO;
    private StudentDTO studentDTO;

}
