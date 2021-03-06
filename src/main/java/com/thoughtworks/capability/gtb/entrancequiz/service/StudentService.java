package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import com.thoughtworks.capability.gtb.entrancequiz.repository.StudentMapper;
import com.thoughtworks.capability.gtb.entrancequiz.request.StudentRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentMapper studentMapper;

    public StudentService(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public List<Student> findAll(){
        return studentMapper.findAll();
    }

    public void save(StudentRequest request) {
        Student student = new Student(100,"New people added");
        // To do here
    }

    public List<Student> getAllStudents() {
        return studentMapper.getAllStudent();
    }




}



