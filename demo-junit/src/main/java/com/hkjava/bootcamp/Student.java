package com.hkjava.bootcamp;

import java.util.ArrayList;
import java.util.List;

import lombok.NoArgsConstructor;
import lombok.NonNull;

// @NoArgsConstructor
public class Student {
    @NonNull 
    private List<Subject> subjects;

    public Student() {
        subjects = new ArrayList<>();
    }
    
    public List<Subject> getSubjects() {
        return this.subjects;
    }
}
