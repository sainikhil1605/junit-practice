package com.nikhil.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyBeforeAfterTest {

    @BeforeEach
    void beforeEach(){
        System.out.println("BeforeEach");
    }
    @Test
    void test1() {
        System.out.println("Test1");
    }
    @Test
    void test2() {
        System.out.println("Test2");
    }
    @Test
    void test3(){
        System.out.println("Test3");
    }
    @AfterEach
    void afterEach(){
        System.out.println("AfterEach");
    }
}