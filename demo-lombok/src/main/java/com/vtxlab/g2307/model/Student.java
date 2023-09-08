package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

//@NoArgsConstructor
// would crash with RequiredArgsConstructor because RequiredArgsConstructor is 0 attribute in this class 
@RequiredArgsConstructor
@AllArgsConstructor
public class Student {

    // no final, no non null attribute
    private int age;

    public static void main(String[] args) {
        Student student = new Student(); 
        // this empty contructor new Student() is came from @RequiredArgsConstructor
        // this annoatation would create a minimal constructor that can create the instance of this class
        // at here, nothing must be filled as no final, no non null attribute
        // so the minimal required is 0 field
    }
}
