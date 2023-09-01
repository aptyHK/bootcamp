package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor // annotation
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
public class PersonLombok {
    // some annotation can put on field level, like getter, which only affect to that field
    private String name;
    @ToString.Include private int age;

    // still can build contructor if not duplicate
    public PersonLombok(String name) {
        this.name = name;
    }

    // can override the get set method so you can add your own feature
    public String getName() {
        System.out.println("Custom version ");
        return this.name;
    }

    public static void main(String[] args) {
        PersonLombok personLombok = new PersonLombok("Peter", 30);
        PersonLombok p2 = new PersonLombok();
        p2.setAge(13);
        p2.setName("Eric");
        System.out.println(p2.getAge());
        System.out.println(p2.getName());
        System.out.println(p2.toString());
    }
}
