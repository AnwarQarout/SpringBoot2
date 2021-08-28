package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTML;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    //	@GetMapping
//	public String printSomething(){
//	return "Yo fam, welcome!";
//	}

//    @GetMapping
//    public List<Student> printStudents() {
//        return studentService.printStudents();
//    }

    @GetMapping("/student")
    public String getStudents(Model model) {
        Student student = new Student();
        model.addAttribute("Student", student);
        return "student";
        //return studentService.getStudents();
    }

/*    @PostMapping("/student")
    public void RegisterStudent(@RequestBody Student student){
        studentService.registerStudent(student);
    }*/

    @PostMapping("/student")
    public String RegisterStudent(@ModelAttribute Student student,  Model model) {
        model.addAttribute("Student", student);
        studentService.registerStudent(student);
        return "result";
    }

    @GetMapping("/ListOfStudents")
    public String ListOfStudents(Model model){
        List<Student> listOfStudents = studentService.getStudents();
        model.addAttribute("result",listOfStudents);
        return "ListOfStudents";
    }

    @GetMapping("/temp")
    public String tempFunc(){
        return "temp";
    }
}
