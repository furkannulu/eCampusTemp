package com.ecampus.service;

import com.ecampus.model.Student;
import com.ecampus.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        this.studentRepository.save(student);
        return student;
    }
    public Student GetStudent(Long id){
        return studentRepository.findById(id).get();
    }
//    public Student SetStudent(Long id,Student student){
//        student.setStudentNo();
//        student.setStudentType();
//        student.setId();
//        .
//        .
//        .
//        studentRepository.save(student);
//    }
//    public Student RemoveStudent(Long id){
//        studentRepository.findById(id).
//    }
//    public Student UpdateStudent(Student student){
//    }
    public List<Student> GetAllStudents() {
        return studentRepository.findAll();
    }
}
