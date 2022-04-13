package com.example.school.controller;

import com.example.school.service.ClassroomService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/classroom")
@CrossOrigin
@RequestScope
@RequiredArgsConstructor
@Validated
public class ClassroomController {
    private final ClassroomService classroomService;

}
