package com.uday.DAO;

import com.uday.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao {
    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(5,"mario","Maths"));
                add(new Student(34,"Jackson","Arts"));
                add(new Student(57,"Jack","Dance"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public Student deleteStudentById(int id) {
        return null;
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudent(Student student) {

    }
}
