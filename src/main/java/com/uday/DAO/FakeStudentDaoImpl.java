package com.uday.DAO;

import com.uday.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("MongoData")
public class FakeStudentDaoImpl implements StudentDao {

    private static Map<Integer,Student> students;

    static {
        students= new HashMap<Integer,Student>(){
            {
                put(1,new Student(1,"Uday","Computer Science"));
                put(2,new Student(2,"Keval","MBA"));
                put(3,new Student(3,"Khushal","CA"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id){
        return this.students.get(id);
    }

    @Override
    public Student deleteStudentById(int id) {
        return this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student){
        Student s=this.students.get(student.getId());
        s.setName(student.getName());
        s.setCourse(student.getCourse());
        this.students.put(student.getId(),s);
    }

    @Override
    public void insertStudent(Student student) {
        this.students.put(student.getId(),student);
    }
}
