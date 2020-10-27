package com.thoughtworks.capability.gtb.entrancequiz.model;

public class StudentBuilder {
    private Integer id = -1;
    private String name = "TestName";

    public StudentBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public StudentBuilder withName(String Name){
        this.name = Name;
        return this;
    }

    public Student build(){
        return new Student(id, name);
    }
}
