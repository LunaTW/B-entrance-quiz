package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.controller.dto.TeamResponse;
import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @CrossOrigin()
    @GetMapping()
    public ResponseEntity<TeamResponse> getAllContacts() {
        List<Student> trainees = studentService.findAll();
        return ResponseEntity.ok(new TeamResponse(trainees));
    }
}
