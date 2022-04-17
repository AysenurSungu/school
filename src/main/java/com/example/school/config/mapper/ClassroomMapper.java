package com.example.school.config.mapper;

import com.example.school.dto.ClassroomDTO;
import com.example.school.entity.Classroom;
import org.mapstruct.Mapper;

@Mapper
public interface ClassroomMapper {

    ClassroomDTO classroomToClassroomDTO(Classroom classroom);
    Classroom classroomDTOToClassroom(ClassroomDTO classroomDTO);

}
