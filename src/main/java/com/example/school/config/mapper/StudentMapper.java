package com.example.school.config.mapper;

import com.example.school.dto.StudentDTO;
import com.example.school.entity.Student;
import org.mapstruct.Mapper;

@Mapper
public interface StudentMapper {

    StudentDTO studentTotStudentDTO(Student student);
    Student studentDTOToStudent(StudentDTO studentDTO);

}
