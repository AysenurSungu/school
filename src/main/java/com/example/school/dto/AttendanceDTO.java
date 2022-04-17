package com.example.school.dto;

import com.example.school.entity.Student;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AttendanceDTO {

    private String remark;
    private boolean status;
    private Student student;


}
