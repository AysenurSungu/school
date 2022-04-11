package com.example.school.entity;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.time.LocalDateTime;

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
    private Long examTypeId;

    @Column
    @Max(45)
    private String examTypeName;

    @Column
    @Max(45)
    private String desc;

    @CreatedDate
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime lastModifiedDate;
}
