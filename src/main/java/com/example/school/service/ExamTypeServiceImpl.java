package com.example.school.service;

import com.example.school.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExamTypeServiceImpl implements ExamTypeService {
    private final TeacherRepository teacherRepository;
}
