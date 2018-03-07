package com.uday.Controller;

import com.uday.Entity.Student;
import com.uday.Service.StudentService;
import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return this.studentService.getStudentById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Student deleteStudentById(@PathVariable("id") int id){
        return this.studentService.deleteStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
    }
}
