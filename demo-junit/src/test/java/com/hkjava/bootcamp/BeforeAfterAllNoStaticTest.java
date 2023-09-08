package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

// need either set:
// before all and after all use static class // then each test would have individual object (test x=1, test2 x=1)
// or apply below annotation // then each test would share same object (test x=1, test2 x=2)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAfterAllNoStaticTest {

    private int x;

    @BeforeAll
    void beforeAll() {
        System.out.println("beforeAll start");
    }

    @AfterAll
    void afterAll() {
        System.out.println("afterAll start");
    }

    @Test
    void test() {
        x++;
        assertTrue(x == 1);
        System.out.println("test x=" + x);
    }

    @Test
    void test2() {
        x++;
        assertTrue(x == 2);
        System.out.println("test2 x=" + x);
    }

}
