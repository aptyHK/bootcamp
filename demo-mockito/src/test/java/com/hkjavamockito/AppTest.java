package com.hkjavamockito;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

/**
 * Unit test for simple App.
 */

@ExtendWith(MockitoExtension.class) // if no this annotation, cannot work with junit5 to perform test
// because this line mean include Mockito into junit
@MockitoSettings(strictness = Strictness.LENIENT)
public class AppTest {

    // Why need to mock?
    // because there are 2 layer of object
    // if only 1 layer, no need mock
    @Mock
    Calculator calculator;

    @Mock
    Calculator calculator2;

    @InjectMocks
    CheckOut checkout; // then no need to create object reference new the object
    // will also check constructor, and put necessary dependendcy from what you had
    // Mock
    // if calculator put on state but no Mock annotation, will have null pointer
    // exception
    // if no mock and no calculator, will have compile error
    // if have check out but no injectmock annotation, so did not inject and report
    // null pointer

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator(3);
        assertEquals(-7, calculator.subtract(10, 6));
    }

    @Test
    void testAdd() {
        when(calculator.subtract(3, 4)).thenReturn(100); // y + 100

        //CheckOut checkout = new CheckOut(calculator);
        int result = checkout.add(3, 4);
        // as x > 1, fit the condition in CheckOut.java so would call calculator.subtract
        // as calculator.subtract has been called so fit line 30, so instead of do the actual method
        // it woul directly return 100 at the this.calculator.subtract(x, y) part
        // the whole add is "return y + this.calculator.subtract(x, y);"
        // so is "4 + 100"
        assertEquals(104, result); // so 104 is ture

        verify(calculator, times(1)).subtract(3, 4);
    }

    @Test
    void testAdd2() {
        // if you don't do the @MockitoSettings(strictness = Strictness.LENIENT)
        // testAdd2 would report error on the when and verify
        // because at here, if it won't touch to the calculator2.subtract
        // you should not put this when condition
        // same for verify
        when(calculator2.subtract(1, 4)).thenReturn(1000);

        //CheckOut checkout = new CheckOut(calculator2);
        int result = checkout.add(1, 4);
        assertEquals(5, result);
        verify(calculator, never()).subtract(1, 4);
    }

    @Test
    void testMultiply() {
        when(calculator.subtract(7, 9)).thenReturn(50000);
        when(calculator.multiply(7, 9)).thenReturn(10000);
        int result = checkout.multiply(7, 9); // x > 1, so will take the multiply path
        assertEquals(10009, result); // 9 + 10000
        verify(calculator, times(1)).multiply(7, 9);
    }

    @Test
    void testMultiply2() {
        when(calculator.subtract(3, 8)).thenReturn(10000);
        int result = checkout.multiply(3, 8); // x > 1, so will take the multiply path
        assertEquals(8, result); // as y = 8
    }
}
