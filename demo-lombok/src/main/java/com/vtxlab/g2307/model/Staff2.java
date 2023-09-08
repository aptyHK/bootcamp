package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
// now @EqualsAndHashCode would apply to super class after added callSuper = true
 

public class Staff2 extends Human {
    private double salary;

    // you have to manually code the construstor with Parent's attribute
    public Staff2(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public static void main(String[] args) {
        Staff2 staff = new Staff2("John", 3000.0);
        Staff2 staff2 = new Staff2("Peter", 3000.0);

        System.out.println(staff.equals(staff2)); // false
    }
    
}
