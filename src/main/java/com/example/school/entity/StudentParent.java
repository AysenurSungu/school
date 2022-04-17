package com.example.school.entity;


import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "studentParent")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentParent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="parent_id")
    private Parent parent;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

    @CreatedDate
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime lastModifiedDate;

}
