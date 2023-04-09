package com.vue.js.mysql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vue.js.mysql.entity.Student;
import com.vue.js.mysql.repository.StudentRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class StudentController {

	@Autowired
    private StudentRepository repository;
	@GetMapping
	 public List<Student> fetchStudents(){
	        return repository.findAll();
	    }

}
