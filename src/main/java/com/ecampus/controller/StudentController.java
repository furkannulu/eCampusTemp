package com.ecampus.controller;


import com.ecampus.model.Student;
import com.ecampus.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping()
    public Student addStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
    }
//    @GetMapping()
//    public CollectionModel<Student> GetAllStudents()
//    {
//        List<Student> studentList = studentService.GetAllUsers();
//        for (Student student : studentList) {
//            Long studentID = student.getId();
//            Link selfLink = linkTo(StudentController.class).slash(studentID).withSelfRel();
//            student.add(selfLink);
//        }
//        Link link = linkTo(StudentController.class).withSelfRel();
//        CollectionModel<Student> result = CollectionModel.of(studentList, link);
//        return result;
//    }
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id){return studentService.GetStudent(id);}
//    @GetMapping("/students")
//    public Student getAllStudent(@RequestBody Student student){return studentService.GetAllStudents();}
}
