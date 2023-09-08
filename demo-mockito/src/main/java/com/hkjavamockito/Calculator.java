package com.hkjavamockito;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Calculator {

    private int weight = 2;

    // public static int add(int x, int y) {
    // if (x > 1) {
    // return y + subtract(x, y);
    // }
    // return x + y;
    // }

    public int subtract(int x, int y) {
        return y - x - this.weight;
    }

    public int multiply(int x, int y) {
        return y * x;
    }
}
