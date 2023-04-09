package com.vue.js.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vue.js.mysql.entity.Student;
import com.vue.js.mysql.repository.StudentRepository;

@SpringBootApplication
public class VueJsMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueJsMySqlApplication.class, args);
	}
	@Autowired
	private StudentRepository repository;

	public void run(String... args) throws Exception {

		Student student1 = Student.builder()
				.firstName("Ramesh")
				.lastName("Fadatare")
				.email("ramesh@gmail.com")
				.phone("1236547890")
				.build();

		Student student2 = Student.builder()
				.firstName("Tony")
				.lastName("Stark")
				.email("tony@gmail.com")
				.phone("7410852369")
				.build();

		Student student3 = Student.builder()
				.firstName("John")
				.lastName("Cena")
				.email("cena@gmail.com")
				.phone("7845120369")
				.build();

		repository.save(student1);
		repository.save(student2);
		repository.save(student3);
	}
}
