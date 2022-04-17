package com.example.school.config.mapper;

import com.example.school.dto.AttendanceDTO;
import com.example.school.entity.Attendance;

public class AttendanceMapperImpl implements AttendanceMapper {

    @Override
    public AttendanceDTO attendanceToAttendanceDTO(Attendance attendance) {
        if(attendance == null){
            return null;
        }
        AttendanceDTO attendanceDTO = new AttendanceDTO();

        attendanceDTO.setRemark(attendance.getRemark());
        attendanceDTO.setStatus(attendance.isStatus());
        attendanceDTO.setStudent(attendance.getStudent());

        return attendanceDTO;
    }

    @Override
    public Attendance attendanceDTOToAttendance(AttendanceDTO attendanceDTO) {
        if(attendanceDTO == null){
            return null;
        }
        Attendance attendance = new Attendance();

        attendance.setRemark(attendanceDTO.getRemark());
        attendance.setStatus(attendanceDTO.isStatus());
        attendance.setStudent(attendanceDTO.getStudent());

        return attendance;
    }

}
