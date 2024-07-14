package com.tasks.demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class HelloWorldTest {
    @Test
    public void testGreet() {
        assertEquals("Hello, Learner!", HelloWorld.greet());
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void greet() {
    }
}
