package com.example.school.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseDTO {

    private String courseName;
    private String description;
    private GradeDTO gradeDTO;
    private List<ExamResultDTO> examResultDTOS;

}
