package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
// @AllArgsConstructor 
// this AllArgsConstructor did not consider parent class
public class Staff extends Human {
    private double salary;

    // you have to manually code the construstor with Parent's attribute
    public Staff(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public static void main(String[] args) {
        Staff staff = new Staff("John", 3000.0);
        Staff staff2 = new Staff("Peter", 3000.0);

        System.out.println(staff.equals(staff2)); // true
    }
    
}
