package com.example.school.config.mapper;

import com.example.school.dto.CourseDTO;
import com.example.school.entity.Course;
import org.mapstruct.Mapper;

@Mapper
public interface CourseMapper {

    CourseDTO courseToCourseDTO(Course course);
    Course courseDTOToCourse(CourseDTO courseDTO);

}
