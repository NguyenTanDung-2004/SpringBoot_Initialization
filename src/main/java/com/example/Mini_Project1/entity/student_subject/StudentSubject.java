package com.example.Mini_Project1.entity.student_subject;

import com.example.Mini_Project1.entity.Student;
import com.example.Mini_Project1.entity.Subject;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student_subject")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentSubject {
    @EmbeddedId
    private StudentSubjectId id;

    private Double point;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    @ManyToOne
    @MapsId("subjectId")
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Subject subject;
}
