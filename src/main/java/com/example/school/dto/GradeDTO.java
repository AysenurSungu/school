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
public class GradeDTO {

    private String gradeName;
    private String desc;
    private List<CourseDTO> course;
    private List<ClassroomDTO> classroomDTOS;
}
