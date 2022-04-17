package com.example.school.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClassroomStudentDTO {

    private int exam1;
    private int exam2;
    private double average;
    private boolean isPassed;
    private ClassroomDTO classroomDTO;
    private StudentDTO studentDTO;

}
