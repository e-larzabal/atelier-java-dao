package fr.wildcodeschool.students.controllers;

import fr.wildcodeschool.students.models.Student;
import fr.wildcodeschool.students.repository.StudentRepoTls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentControllerTls {
    
    @Autowired
    @Qualifier("studentRepoTls")
    private StudentRepoTls studentRepoTls;

    @ResponseBody
    @GetMapping("/students/Toulouse")
    public List<Student> getStudents() {
        return studentRepoTls.findAll();
    }

}