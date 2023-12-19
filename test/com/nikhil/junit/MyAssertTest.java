package com.nikhil.junit;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyAssertTest {

    List<String> todos=Arrays.asList("AWS","Azure","Devops");
    @Test
    void calculateSum() {
        boolean test=todos.contains("AWS");
        boolean test2=todos.contains("GCP");
        assertEquals(true,test);
        assertTrue(true);
        assertFalse(test2);
    }

}