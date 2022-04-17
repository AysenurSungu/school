package com.example.school.config.mapper;

import com.example.school.dto.GradeDTO;
import com.example.school.entity.Grade;
import org.mapstruct.Mapper;

@Mapper
public interface GradeMapper {

    GradeDTO gradeToGradeDTO(Grade grade);
    Grade gradeDTOToGrade(GradeDTO gradeDTO);

}
