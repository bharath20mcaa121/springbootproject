package com.example.project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	public Student saveDetails(Student student) {
	    System.out.println("Saving student: " + student);
	    return studentRepo.save(student);
	}
	
	public List<Student> FindAllStudent() {
		return studentRepo.findAll();		
}

	public Student FindAllStudentbyid(int id) {
		return studentRepo.findById(id).orElseThrow(()-> new EntityNotFoundException("student with Id"+ id +"Not Found"));
	}
		
		public Student deletebyid(int id) {
			Optional<Student> presentdata=studentRepo.findById(id);
			if(presentdata.isEmpty()) {
			throw new EntityNotFoundException("Student with ID " + id + " not found.");
			}
			 studentRepo.deleteById(id);
			 return presentdata.get();
		}
}
