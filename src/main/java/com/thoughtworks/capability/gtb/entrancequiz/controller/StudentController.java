package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.controller.dto.TeamResponse;
import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import com.thoughtworks.capability.gtb.entrancequiz.request.StudentRequest;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping()
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @CrossOrigin()
    @GetMapping("/students")
    public ResponseEntity<TeamResponse> getAllContacts() {
        List<Student> students = studentService.findAll();
        return ResponseEntity.ok(new TeamResponse(students));
    }

    @PostMapping("/students")
    public ResponseEntity<HttpStatus> addStudent(StudentRequest request) {

        studentService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

//    @GetMapping("/groups/random")
//    public ResponseEntity<Map<String, List<Student>>> RandomGroups() {
//        return ResponseEntity
//                .ok( );
//    }


}
