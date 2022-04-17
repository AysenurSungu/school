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
public class ParentDTO {

    private String email;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String phone;
    private String mobile;
    private boolean status;
    private Date lastLoginDate;
    private String lastLoginIp;
    private List<StudentParentDTO> studentParent;

}
