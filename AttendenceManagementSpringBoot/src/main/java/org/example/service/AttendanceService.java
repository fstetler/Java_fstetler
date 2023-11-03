package org.example.service;

import org.example.model.AttendancePerson;
import org.example.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {

    @Autowired
    public AttendanceRepository attendanceRepository;

    public List<AttendancePerson> getAllAtenndancePersons() {
        return attendanceRepository.findAll();
    }

    public AttendancePerson getTestPerson() {
        return new AttendancePerson(1, "Fredrik", "shit", "shit", "shit", "shit");
    }

    public AttendancePerson getAttendancePersonById(int id) {
        return attendanceRepository.getReferenceById(id);
    }
}
