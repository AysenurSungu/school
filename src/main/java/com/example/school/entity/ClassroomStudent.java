package com.example.school.entity;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "classrooms")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"id"})
public class ClassroomStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="exam1")
    private int exam1;

    @Column(name="exam2")
    private int exam2;

    @Column(name="average")
    private double average;

    @Column(name="is_passed")
    private boolean isPassed;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="classroom_id")
    private Classroom classroom;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="student_id")
    private Student student;

    @CreatedDate
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime lastModifiedDate;
}
