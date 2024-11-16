package com.example.Mini_Project1.entity;

import java.time.LocalDate;
import java.util.Set;

import com.example.Mini_Project1.entity.student_subject.StudentSubject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private LocalDate dob; // date of birth
    private String email;
    private String password;

    // student_subject
    @OneToMany
    @JoinColumn(name = "student_id")
    private Set<StudentSubject> setStudentSubjects;
}
