package com.example.school.controller;

import com.example.school.dto.ClassroomDTO;
import com.example.school.entity.Classroom;
import com.example.school.service.ClassroomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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

    @PostMapping
    public ResponseEntity<ClassroomDTO> createClassroom(@RequestBody @Validated Classroom classroom){
        ClassroomDTO classroomDTO = classroomService.createClassroom(classroom);
        return ResponseEntity.ok(classroomDTO);
    }

}
