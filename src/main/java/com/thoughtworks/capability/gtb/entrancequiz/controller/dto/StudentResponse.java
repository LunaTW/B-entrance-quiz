package com.thoughtworks.capability.gtb.entrancequiz.controller.dto;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;

public class StudentResponse {
    private Integer id;
    private String name;

    public StudentResponse(Student student) {
        this.id = student.getId();
        this.name = student.getName();
    }
}
