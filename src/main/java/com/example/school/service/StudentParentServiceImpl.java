package com.example.school.service;

import com.example.school.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentParentServiceImpl implements StudentParentService {
    private final StudentRepository studentRepository;
}
