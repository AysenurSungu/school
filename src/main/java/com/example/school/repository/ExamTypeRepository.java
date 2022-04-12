package com.example.school.repository;

import com.example.school.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamTypeRepository extends JpaRepository<Attendance, Long> {
}

