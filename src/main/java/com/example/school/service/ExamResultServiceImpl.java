package com.example.school.service;

import com.example.school.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExamResultServiceImpl implements ExamResultService {
    private final TeacherRepository teacherRepository;
}
