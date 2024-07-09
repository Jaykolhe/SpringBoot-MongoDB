package com.mongo.DB.Entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class Department {
		
		private String dept_name;
		
		
		private String location;
		public String getDept_name() {
			return dept_name;
		}
		public void setDept_name(String dept_name) {
			this.dept_name = dept_name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		
}
