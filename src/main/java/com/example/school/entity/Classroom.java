package com.example.school.entity;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.time.LocalDateTime;
import java.util.Date;

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
    private Long classroomId;

    @Column
    private Date year;

    @Column
    private Grade gradeId;

    @Column
    @Max(2)
    private String section;

    @Column
    private boolean status;

    @Column
    @Max(45)
    private String remarks;

    @Column
    private Teacher teacherId;

    @CreatedDate
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime lastModifiedDate;

}
