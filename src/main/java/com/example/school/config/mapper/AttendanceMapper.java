package com.example.school.config.mapper;

import com.example.school.dto.AttendanceDTO;
import com.example.school.entity.Attendance;
import org.mapstruct.Mapper;

@Mapper
public interface AttendanceMapper {

    AttendanceDTO attendanceToAttendanceDTO(Attendance attendance);

    Attendance attendanceDTOToAttendance(AttendanceDTO attendanceDTO);

}
