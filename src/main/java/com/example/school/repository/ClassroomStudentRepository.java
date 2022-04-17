package com.example.school.repository;

import com.example.school.entity.ClassroomStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomStudentRepository extends JpaRepository<ClassroomStudent, Long> {

}

