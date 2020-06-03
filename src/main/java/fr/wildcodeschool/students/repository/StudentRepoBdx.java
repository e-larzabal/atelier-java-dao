package fr.wildcodeschool.students.repository;

import fr.wildcodeschool.students.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepoBdx implements StudentDao {

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Benat"));
        students.add(new Student("Leontxo"));
        students.add(new Student("Maitane"));

        Student antton = new Student("Antton");
        students.add(antton);

        return students;
    }

    public String test() {
        return "Coucou!!!";
    }
}
