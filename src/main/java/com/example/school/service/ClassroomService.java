package com.example.school.service;

import com.example.school.dto.ClassroomDTO;
import com.example.school.entity.Classroom;

public interface ClassroomService {
    ClassroomDTO createClassroom(Classroom classroom);
}
