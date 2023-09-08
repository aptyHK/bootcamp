package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class BeforeAfterTest {
    
    private int x;

    @BeforeEach
    void beforeEach() {
        System.out.println("before each start!!");
        assertEquals(0, this.x);
        this.x += 3;
    }

    @AfterEach
    void endOfEach() {
        System.out.println("endOfTest start");
        this.x -= 2;
        System.out.println("ended. x=" + this.x);
    }

    @Test
    void testAdd() {
        System.out.println("testAdd start");
        assertEquals(8, App.add(this.x, 5));
    }

    @Test
    void testAdd2() {
        System.out.println("testAdd2 start");
        assertEquals(8, App.add(this.x, 5));
    }
}
