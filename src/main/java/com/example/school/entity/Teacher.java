package com.example.school.entity;

import com.example.school.validation.TcKimlikNo;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "teachers")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="classroom_id")
    private Classroom classroom;

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

    @CreatedDate
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime lastModifiedDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Teacher teacher = (Teacher) o;
        return id != null && Objects.equals(id, teacher.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
