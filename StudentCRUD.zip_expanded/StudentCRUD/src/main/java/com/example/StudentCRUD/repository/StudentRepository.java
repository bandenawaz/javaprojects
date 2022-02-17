package com.example.StudentCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentCRUD.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
 
}