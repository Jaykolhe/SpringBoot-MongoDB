package com.mongo.DB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.DB.Entity.Student;
import com.mongo.DB.service.StudentService;

@RestController
@RequestMapping("/api/Student")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		
		return service.createStudent(student);
		
		
	}
	
	@GetMapping("/getByid/{id}")
	public Student getbyId(@PathVariable String id) {
		
		return service.getStudentById(id);
	}
	
	@GetMapping("/all")
	public List<Student> getAll(){
		return service.getall();
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable String id ) {
		
		return service.deleteStudent(id);
	}
	
	
	

}
