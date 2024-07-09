package com.mongo.DB.Entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "student")
public class Student {
	@Id
	private String id;
	

	private String Stud_name;
	

	private String Stud_roll_no;
	
	
	private String stud_age;
	
	
	private Department department;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStud_name() {
		return Stud_name;
	}

	public void setStud_name(String Stud_name) {
		this.Stud_name = Stud_name;
	}

	public String getStud_roll_no() {
		return Stud_roll_no;
	}

	public void setStud_roll_no(String Stud_roll_no) {
		this.Stud_roll_no = Stud_roll_no;
	}

	public String getStud_age() {
		return stud_age;
	}

	public void setStud_age(String stud_age) {
		this.stud_age = stud_age;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department Department) {
		this.department = Department;
	}
	
	
	

	

	
	

}
