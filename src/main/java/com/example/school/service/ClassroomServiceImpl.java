package com.example.school.service;


import com.example.school.config.mapper.ClassroomMapper;
import com.example.school.dto.ClassroomDTO;
import com.example.school.entity.Classroom;
import com.example.school.repository.ClassroomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClassroomServiceImpl implements ClassroomService{

    private final ClassroomRepository classroomRepository;
    private final ClassroomMapper classroomMapper;

    @Override
    public ClassroomDTO createClassroom(Classroom classroom) {
        var result = classroomRepository.save(classroom);
        var createdClassroom = classroomMapper.classroomToClassroomDTO(result);

        return createdClassroom;
    }
}
