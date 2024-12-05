package com.hbt.embeddable_annotation;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "teachers") // Explicit table name for better SQL readability
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private int id;

    @Column(name = "teacher_name", nullable = false) // Explicit naming for clarity
    private String techName;

    @Column(name = "email")
    private String email;


//    @Embedded
//    @AttributeOverrides({
//        @AttributeOverride(name = "id", column = @Column(name = "course_id")),
//        @AttributeOverride(name = "name", column = @Column(name = "course_name")),
//        @AttributeOverride(name = "duration", column = @Column(name = "course_duration"))
//    })
    private Course course;
}
