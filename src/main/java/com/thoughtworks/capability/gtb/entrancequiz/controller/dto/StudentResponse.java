package com.thoughtworks.capability.gtb.entrancequiz.controller.dto;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;

public class StudentResponse {
    private Integer id;
    private String name;

    public StudentResponse(Student student) {
        this.id = student.getId();
        this.name = student.getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
