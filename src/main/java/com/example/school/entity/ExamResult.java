package com.example.school.entity;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.time.LocalDateTime;

@Entity
@Table(name = "examResults")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExamResult{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name="course_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name="exam_id")
    private Exam exam;

    @Column
    @Max(45)
    private String marks;

    @CreatedDate
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime lastModifiedDate;
}
