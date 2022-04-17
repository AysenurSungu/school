package com.example.school.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExamDTO {


    private List<ExamResultDTO> examResultDTOS;
    private ExamTypeDTO examTypeDTO;
    private String examName;

}
