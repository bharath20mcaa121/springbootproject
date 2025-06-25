package com.example.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@Autowired
	StudentService studentService;
	
    @PostMapping("/addStudent")
    public Student postStudent(@RequestBody Student student) {
        System.out.println("Incoming JSON mapped to Student: " + student);
        return studentService.saveDetails(student);
    }
    
    @GetMapping("/getall")
    public List<Student> getAllStudent(){
    	return studentService.FindAllStudent();
    }
    
    @GetMapping("/get/{id}")
    public Student getAllStudentbyid(@PathVariable int id){	
    	return studentService.FindAllStudentbyid(id);
    }
    
    @DeleteMapping("/deletebyid/{id}")
    public Student deletebyid(@PathVariable int id) {	
    	return studentService.deletebyid(id);
    }
	
}
