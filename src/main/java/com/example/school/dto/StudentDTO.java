package com.example.school.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {


    private String email;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String phone;
    private String mobile;
    private List<StudentParentDTO> studentParent;
    private List<ExamResultDTO> examResultDTOS;
    private List<ClassroomStudentDTO> classroomStudentDTOS;
    private List<AttendanceDTO> attendanceDTO;
    private Date dateOfJoin;
    private boolean status;
    private Date lastLoginDate;
    private String lastLoginIp;


}
