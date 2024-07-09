package com.mongo.DB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.DB.Entity.Student;
import com.mongo.DB.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repo;

	public Student createStudent(Student student) {
		
		return repo.save(student);
	}

	public Student getStudentById(String id) {
		
		return repo.findById(id).get();
	}

	public List<Student> getall() {
		
		return repo.findAll();
	}

	public Student updateStudent(Student student) {
		
		return repo.save(student);
	}

	public String deleteStudent(String id) {
		 repo.deleteById(id);
		 return "Student Has Been Deleted";
	}

}
