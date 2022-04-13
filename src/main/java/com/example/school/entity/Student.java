package com.example.school.entity;

import com.example.school.validation.TcKimlikNo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "students")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"id"})
public class Student {

    @Id
    @TcKimlikNo
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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

    @JsonIgnore
    @OneToMany(mappedBy = "student")
    private List<StudentParent> studentParent;

    @JsonIgnore
    @OneToMany(mappedBy = "student")
    private List<ExamResult> examResults;

    @JsonIgnore
    @OneToMany(mappedBy = "student")
    private List<ClassroomStudent> classroomStudents;

    @OneToMany(mappedBy = "student")
    private List<Attendance> attendance;

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
