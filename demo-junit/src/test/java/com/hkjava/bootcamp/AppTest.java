package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
// if i static the method, is very convinent
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default
@DisplayName("Assert Method Tests")
public class AppTest {

    private int x;

    @Test
    @DisplayName("AssertEquals Test")
    void testAddMethod() {
        // Assertions.assertEquals(actual value, expected value);
        // Assertions.assertEquals(5, App.add(2, 3));
        assertEquals(5, App.add(2, 3));
        assertEquals(7, App.add(2, 5));
        assertEquals(0, App.add(0, 0));
        // assertEquals(-4, App.add(-6, -2));
        // assertEquals(2112, App.add(2, 5));
        x++;
        assertEquals(1, x); // tested each test would create new object
    }

    @Test
    void testAssertNotEqual() {
        assertNotEquals(4, App.add(1, 2));
        x++;
        assertEquals(1, x);
    }

    @Test
    void testAssertTure() {
        assertTrue(12 == App.add(7, 5));
    }

    @Test
    void testAssertFalse() {
        assertFalse(13 == App.add(7, 5));
    }

    @Test
    void testAssertNull() {
        String str = null;
        assertNull(str);
    }

    @Test
    void testAssertNotNull() {
        Student student = new Student();
        assertNotNull(student.getSubjects());
    }

    @Test
    void testAssertThrows() {
        assertThrows(ArithmeticException.class, () -> {
            App.divide(10, 0);
        });

        assertDoesNotThrow(() -> {
            App.divide(10, 5);
        });
    }

    @Test
    void testAssertTimeOut() {
        assertTimeout(Duration.ofMillis(200), () -> {
            Thread.sleep(100); // ms, if I set 200, would timeout then report failure
        });
    }

    @Test
    void testCombine() {
        assertAll(
            () -> assertTrue(10 > 3),
            () -> assertEquals(10, App.add(4, 6)),
            () -> assertNull(null)
        );
    }

    @Test
    void testSame(){
        String s1 = new String("JUnit");
        String s2 = new String("JUnit");
        assertNotSame(s1,s2); // test object reference, same出Object reference
        assertEquals(s1,s2);

        String s3 = "JUnit";
        String s4 = "JUnit";
        assertSame(s3,s4);
        assertEquals(s3,s4);
    }

    public static void main(String[] args) {
        AppTest t1 = new AppTest();
        t1.testAddMethod();

        AppTest t2 = new AppTest();
        t2.testAssertNotEqual();
    }
}
