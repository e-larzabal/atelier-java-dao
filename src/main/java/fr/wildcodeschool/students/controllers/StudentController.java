package fr.wildcodeschool.students.controllers;

import fr.wildcodeschool.students.models.Student;
import fr.wildcodeschool.students.repository.StudentDao;
import fr.wildcodeschool.students.repository.StudentRepoBdx;
import fr.wildcodeschool.students.repository.StudentRepoTls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class StudentController {

    // Implementation n°1 : Toulouse's Students
    @Autowired
    @Qualifier("studentRepoTls")
    private StudentRepoTls studentRepoTls;

    // Implementation n°2 : Bordeaux's Students
    @Autowired
    @Qualifier("studentRepoBdx")
    private StudentRepoBdx studentRepoBdx;

    /* Exemples de route :
        http://localhost:8080/students?ville=Bordeaux
        http://localhost:8080/students?ville=Toulouse
        http://localhost:8080/students
     */
    @ResponseBody
    @GetMapping("/students")
    public List<Student> getStudents(@RequestParam(value="ville", required = false, defaultValue = "Toulouse") String ville) {

        if ( ville.equals("Bordeaux") ) {
            return studentRepoBdx.findAll();
        } else {
            // Toulouse by default
            return studentRepoTls.findAll();
        }
    }

}