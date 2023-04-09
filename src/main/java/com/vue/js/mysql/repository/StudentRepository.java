package com.vue.js.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vue.js.mysql.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
