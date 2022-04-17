package com.example.school.config.mapper;

import com.example.school.dto.ExamDTO;
import com.example.school.entity.Exam;
import org.mapstruct.Mapper;

@Mapper
public interface ExamMapper {

    ExamDTO examToExamDTO (Exam exam);
    Exam examDTOToExam(ExamDTO examDTO);

}
