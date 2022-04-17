package com.example.school.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "examTypes")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExamType{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @Max(45)
    private String examTypeName;

    @JsonIgnore
    @OneToMany(mappedBy = "examType")
    private List<Exam> exams;

    @Column
    @Max(45)
    private String descriptions;

    @CreatedDate
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime lastModifiedDate;
}
