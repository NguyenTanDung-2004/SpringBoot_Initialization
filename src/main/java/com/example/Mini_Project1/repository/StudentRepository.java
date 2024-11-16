package com.example.Mini_Project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Mini_Project1.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String> {
    @Query("select st from Student st where st.email = :email")
    public Student checkStudentEmail(String email);
}
