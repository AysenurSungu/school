package com.example.school.config.mapper;

import com.example.school.dto.ExamTypeDTO;
import com.example.school.entity.ExamType;
import org.mapstruct.Mapper;

@Mapper
public interface ExamTypeMapper {

    ExamTypeDTO examTypeToExamTypeDTO(ExamType examType);
    ExamType examTypeDTOToExamType(ExamTypeDTO examTypeDTO);

}
