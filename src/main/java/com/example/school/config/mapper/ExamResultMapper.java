package com.example.school.config.mapper;

import com.example.school.dto.ExamResultDTO;
import com.example.school.entity.ExamResult;
import org.mapstruct.Mapper;

@Mapper
public interface ExamResultMapper {

    ExamResultDTO examResultToExamResultDTO(ExamResult examResult);
    ExamResult examResultDTOToExamResult(ExamResultDTO examResultDTO);

}
