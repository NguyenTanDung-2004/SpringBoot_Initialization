package com.example.Mini_Project1.entity.student_subject;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentSubjectId {
    private String studentId;
    private String subjectId;
}
