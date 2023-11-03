package org.example.controller;

import jakarta.faces.annotation.RequestMap;
import org.example.model.AttendancePerson;
import org.example.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    public AttendanceService attendanceService;

    @GetMapping("/allPersons")
    public List<AttendancePerson> getAllAttendancePersons() {
        return attendanceService.getAllAtenndancePersons();
    }

    @GetMapping("/personById")
    public AttendancePerson getAttendancePersonById(int id) {
        return attendanceService.getAttendancePersonById(id);
    }

    @GetMapping("/personTest")
    public AttendancePerson getTestPerson() {
        return attendanceService.getTestPerson();
    }

}
