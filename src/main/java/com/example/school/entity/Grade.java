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
@Table(name = "grades")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"id"})
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @Max(45)
    private String gradeName;

    @Column
    @Max(45)
    private String desc;

    @JsonIgnore
    @OneToMany(mappedBy = "grade", fetch = FetchType.LAZY)
    private List<Course> courses;

    @JsonIgnore
    @OneToMany(mappedBy = "grade", fetch = FetchType.LAZY)
    private List<Classroom> classrooms;

    @CreatedDate
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime lastModifiedDate;
}
