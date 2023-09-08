package com.hkjavamockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.*;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SpyTest {

    @Spy // if i put spy, if don't meet Mockito.when, will perform the original logic
    // if put mock, will return 0 when not meet the Mockito.when
    //both spy and mock can be use on inject mock
    //
    Calculator calculator;

    @InjectMocks
    CheckOut checkout;

    @Test
    void testAdd1() {
        when(calculator.subtract(3, 4)).thenReturn(100);
        int result = checkout.add(3, 4);
        assertEquals(104, result);
        verify(calculator, times(1)).subtract(3, 4);
    }

    @Test
    void testAdd2() {
        int result = checkout.add(3, 4);
        assertEquals(3, result); // 4+(4-3-2) // if use mock instead of spy, here would be 4
        // because no when, so it will run "this.calculator.subtract(x, y)" normally
        // if here is mock, because no when, so will return 
        verify(calculator, times(1)).subtract(3, 4);
    }

    @Test
    void test3() {
        when(calculator.multiply(-2, 4)).thenReturn(100);
        int result = checkout.multiply(-2, 4);
        assertEquals(104, result); // 100 + (4 - (-2) - 2 // if use mock instead of spy, here would be 100
    }
}
