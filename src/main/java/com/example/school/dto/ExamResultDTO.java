package com.example.school.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExamResultDTO {

    private StudentDTO studentDTO;
    private CourseDTO courseDTO;
    private ExamDTO examDTO;
    private String marks;

}
