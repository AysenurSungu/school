package com.example.school.dto;

import com.example.school.entity.ClassroomStudent;
import com.example.school.entity.Grade;
import com.example.school.entity.Teacher;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClassroomDTO {

    private Date year;
    private String section;
    private boolean status;
    private String remarks;
    private List<ClassroomStudent> classroomStudents;
    private List<Teacher> teachers;
    private Grade grade;

}
