package fr.wildcodeschool.students.controllers;

import fr.wildcodeschool.students.models.Student;
import fr.wildcodeschool.students.repository.StudentDao;
import fr.wildcodeschool.students.repository.StudentRepoBdx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class StudentControllerBdx {

    @Autowired
    @Qualifier("studentRepoBdx")
    private StudentDao studentRepoBdx;

    @ResponseBody
    @GetMapping("/students/Bordeaux")
    public List<Student> getStudents() {
        return studentRepoBdx.findAll();
    }

}