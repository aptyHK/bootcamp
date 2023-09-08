package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@SuperBuilder
public abstract class Human {
    private String name;   
}
