package com.example.school.controller;

import com.example.school.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/student")
@CrossOrigin
@RequestScope
@RequiredArgsConstructor
@Validated
public class StudentController {
    private final StudentService studentService;
}
