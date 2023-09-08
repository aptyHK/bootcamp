package com.hkjavamockito;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CheckOut {

// when create checkout
// need to input calculator first
// so can make sure can call Calculator.subtract

    // @NonNull
    private Calculator calculator;
    
    public int add(int x, int y) {
        //Calculator calculator = new Calculator(weight);
        if (x > 1) {
            return y + this.calculator.subtract(x, y);
        }
        return x + y;
    }

    public int multiply(int x, int y) {
        if (x > 1) {
            return y + this.calculator.multiply(x, y);
        } else if (x == 0) {
            return y + this.calculator.subtract(x, y);
        }
        return this.calculator.multiply(x, y)+ this.calculator.subtract(x, y);
    }
}

// 將個責任向外移! 起checkout一定要比Calculator 佢