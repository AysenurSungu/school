package com.example.school.service;

import com.example.school.repository.ClassroomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClassroomServiceImpl implements ClassroomService{
    private final ClassroomRepository classroomRepository;
}
