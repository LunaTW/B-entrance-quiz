package com.thoughtworks.capability.gtb.entrancequiz.controller.dto;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class TeamResponse {
    private final List<StudentResponse> students;

    public TeamResponse(List<Student> students) {
        this.students = students.stream().map(StudentResponse::new).collect(Collectors.toList());
    }

    public List<StudentResponse> getStudents(){
        return students;
    }
}
