package com.example.school.service;

import com.example.school.repository.ParentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GradeServiceImpl implements GradeService {
    private final ParentRepository parentRepository;
}
