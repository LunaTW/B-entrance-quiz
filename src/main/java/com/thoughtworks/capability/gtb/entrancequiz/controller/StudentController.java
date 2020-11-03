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

    // TODO GTB-知识点: - @CrossOrigin应指定特定域名，避免使用通配
    @CrossOrigin()
    @GetMapping("/students")
    // TODO GTB-完成度: - 查询学生列表的接口应返回List<StudentResponse>
    public ResponseEntity<TeamResponse> getAllContacts() {
        List<Student> students = studentService.findAll();
        // TODO GTB-知识点: - 已经使用@RestController，可以直接返回TeamResponse
        return ResponseEntity.ok(new TeamResponse(students));
    }

    @PostMapping("/students")
    // TODO GTB-知识点: - 新建资源，应返回新创建的资源，具体规则参考Restful API Design
    public ResponseEntity<HttpStatus> addStudent(StudentRequest request) {

        studentService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
// TODO GTB-工程实践: - 没有及时清理注释掉的代码

//    @GetMapping("/groups/random")
//    public ResponseEntity<Map<String, List<Student>>> RandomGroups() {
//        return ResponseEntity
//                .ok( );
//    }


}
