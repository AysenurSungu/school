package com.example.school.config.mapper;

import com.example.school.dto.TeacherDTO;
import com.example.school.entity.Teacher;
import org.mapstruct.Mapper;

@Mapper
public interface TeacherMapper {

    TeacherDTO teacherToTeacherDTO(Teacher teacher);
    Teacher teacherDTOToTeacher(TeacherDTO teacherDTO);

}
