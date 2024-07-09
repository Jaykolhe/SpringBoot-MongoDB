package com.mongo.DB.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.DB.Entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>  {

}
