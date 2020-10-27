package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentMapper {
    public static List<Student> students = new ArrayList<Student>();

    static {
        students.add(new Student(1, "成吉思汗"));
        students.add(new Student(2, "鲁班七号"));
        students.add(new Student(3, "太乙真人"));
        students.add(new Student(4, "钟无艳"));
        students.add(new Student(5, "花木兰"));
        students.add(new Student(6, "雅典娜"));
        students.add(new Student(7, "芈月"));
        students.add(new Student(8, "白起"));
        students.add(new Student(9, "刘禅"));
        students.add(new Student(10, "庄周"));
        students.add(new Student(11, "马超"));
        students.add(new Student(12, "刘备"));
        students.add(new Student(13, "哪吒"));
        students.add(new Student(14, "大乔"));
        students.add(new Student(15, "蔡文姬"));
    }

    public List<Student> findAll() {
        return new ArrayList<>(StudentMapper.students);
    }

    public List<Student> getAllStudent() {
        return students;
    }

    private static Map<String, List<Student>> teams = new HashMap<String, List<Student>>() {
        // To do
    };

    public Map<String, List<Student>> getTeams() {
        return teams;
    }

    public void clearTeams() {
        teams.values().forEach(list -> {
            list.clear();
        });
    }

    public Student AddToTeam(String teamName, Student student) {
        if (teams.containsKey(teamName)) {
            teams.get(teamName).add(student);
            return student;
        }
        return null;

    }
}



