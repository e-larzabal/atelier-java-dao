package fr.wildcodeschool.students.repository;

import fr.wildcodeschool.students.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepoTls implements StudentDao {
    
    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bernard"));
        students.add(new Student("Hoagie"));
        students.add(new Student("Laverne"));
        return students;
    }
}
