package com.example.school.config.mapper;

import com.example.school.dto.StudentParentDTO;
import com.example.school.entity.StudentParent;
import org.mapstruct.Mapper;

@Mapper
public interface StudentParentMapper {

    StudentParentDTO studentParentToStudentParentDTO(StudentParent studentParent);
    StudentParent studentParentDTOToStudentParent(StudentParentDTO studentParentDTO);

}
