package com.example.school.config.mapper;

import com.example.school.dto.ClassroomDTO;
import com.example.school.entity.Classroom;
import org.springframework.stereotype.Component;

import javax.annotation.processing.Generated;

@Generated( value = "org.mapstruct.ap.MappingProcessor",
        date = "2016-07-27T12:11:25+0200",
        comments = "version: 1.0.0.Final, compiler: javac, environment: Java 1.8.0_66 (Oracle Corporation)"
)
@Component
public class ClassroomMapperImpl implements ClassroomMapper{

    @Override
    public ClassroomDTO classroomToClassroomDTO(Classroom classroom) {
        if(classroom == null){
            return null;
        }

        ClassroomDTO classroomDTO = new ClassroomDTO();

        classroomDTO.setYear(classroom.getYear());
        classroomDTO.setSection(classroom.getSection());
        classroomDTO.setStatus(classroom.isStatus());
        classroomDTO.setRemarks(classroom.getRemarks());
        classroomDTO.setClassroomStudents(classroom.getClassroomStudents());
        classroomDTO.setTeachers(classroom.getTeachers());
        classroomDTO.setGrade(classroom.getGrade());

        return classroomDTO;
    }

    @Override
    public Classroom classroomDTOToClassroom(ClassroomDTO classroomDTO) {
        if(classroomDTO == null){
            return null;
        }

        Classroom classroom = new Classroom();

        classroom.setYear(classroomDTO.getYear());
        classroom.setSection(classroomDTO.getSection());
        classroom.setStatus(classroomDTO.isStatus());
        classroom.setRemarks(classroomDTO.getRemarks());
        classroom.setClassroomStudents(classroomDTO.getClassroomStudents());
        classroom.setTeachers(classroomDTO.getTeachers());
        classroom.setGrade(classroomDTO.getGrade());

        return classroom;
    }
}
