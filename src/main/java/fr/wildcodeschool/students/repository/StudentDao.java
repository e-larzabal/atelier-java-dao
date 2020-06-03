package fr.wildcodeschool.students.repository;

import fr.wildcodeschool.students.models.Student;

import java.util.List;


public interface StudentDao {

    List<Student> findAll();
}
