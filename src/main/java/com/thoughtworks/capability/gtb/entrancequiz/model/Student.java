package com.thoughtworks.capability.gtb.entrancequiz.model;

public class Student {
    private Integer id;
    private String name;

    public Student(Integer id,String name){
        this.id = id;
        this.name = name;
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
        // TODO GTB-工程实践: - 将变量赋值给自身
        name = name;
    }


}

