package com.uday.DAO;

import com.uday.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    Student deleteStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
