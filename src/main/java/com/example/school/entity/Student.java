package com.example.school.entity;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "students")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;

    @Column
    @Email
    @Max(45)
    private String email;

    @Column
    @Max(45)
    private String password;

    @Column
    @Max(45)
    private String firstName;

    @Column
    @Max(45)
    private String lastName;

    @Column
    private Date dateOfBirth;

    @Column
    @Max(15)
    private String phone;

    @Column
    private String mobile;

    @Column
    private Parent parentId;

    @Column
    private Date dateOfJoin;

    @Column
    private boolean status;

    @Column
    private Date lastLoginDate;

    @Column
    @Max(45)
    private String lastLoginIp;

    @CreatedDate
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime lastModifiedDate;
}
