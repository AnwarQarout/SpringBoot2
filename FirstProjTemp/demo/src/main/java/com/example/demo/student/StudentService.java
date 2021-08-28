package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    public List<Student> printStudents() {
        return List.of(new Student(1L,"Anwar","anwarqarout@gmail.com", LocalDate.of(2000, Month.MARCH,5)));
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }


    public void registerStudent(Student student) {
        Optional<Student> s = studentRepository.findStudentByEmail(student.getEmail());
        if(s.isPresent()){
            throw new IllegalStateException("email is already in use");
        }
        else {
            studentRepository.save(student);
        }
    }

}
