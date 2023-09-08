package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor // mean non null field and final field have to handle
public class Car {
    
    @NonNull
    private Integer capacity;
    private final double weight;
    private String color;

    public Car(String color) {
        this.color = color;
        this.weight = 0.0;
    }
    
    public static void main(String[] args) {
        Car car = new Car(3, 5.0); 
        // as private Integer capacity set as should be non null and weight is final, 
        // @RequiredArgsConstructor would create a constructor that need to fill these 2 field
        
    }
}
