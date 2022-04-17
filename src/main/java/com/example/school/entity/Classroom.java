package com.example.school.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "classrooms")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Date year;

    @Column
    private String section;

    @Column
    private boolean status;

    @Column
    private String remarks;

    @JsonIgnore
    @OneToMany(mappedBy = "classroom", fetch = FetchType.LAZY)
    private List<ClassroomStudent> classroomStudents;

    @JsonIgnore
    @OneToMany(mappedBy = "classroom", fetch = FetchType.LAZY)
    private List<Teacher> teachers;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="grade_id")
    private Grade grade;

    @CreatedDate
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime lastModifiedDate;

}
