package com.greatlearning.studentfest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.studentfest.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
