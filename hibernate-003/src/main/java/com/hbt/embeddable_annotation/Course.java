package com.hbt.embeddable_annotation;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class Course {

    @Column(name = "course_id") // Optional column name for clarity
    private int id;

    @Column(name = "course_name", nullable = false) // Ensures the name is mandatory
    private String name;

    @Column(name = "course_duration") // Example: "6 months"
    private String duration;
}