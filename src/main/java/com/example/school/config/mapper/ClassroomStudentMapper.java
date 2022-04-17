package com.example.school.config.mapper;

import com.example.school.dto.ClassroomDTO;
import com.example.school.dto.ClassroomStudentDTO;
import com.example.school.entity.ClassroomStudent;
import org.mapstruct.Mapper;

@Mapper
public interface ClassroomStudentMapper {

    ClassroomStudentDTO classroomStudentToClassroomStudentDTO(ClassroomStudent classroomStudent);
    ClassroomStudent classroomStudentDTOToClassroomStudent(ClassroomDTO classroomDTO);


}
