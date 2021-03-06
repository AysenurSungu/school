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
@Table(name = "parents")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Parent {

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

    @Column
    private boolean status;

    @Column
    private Date lastLoginDate;

    @Column
    @Max(45)
    private String lastLoginIp;

    @JsonIgnore
    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private List<StudentParent> studentParent;

    @CreatedDate
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime lastModifiedDate;
}
