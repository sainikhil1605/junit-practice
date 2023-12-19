package com.nikhil.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class MyMathTest {

    @Test
    void calculateSum() {
        int[] numbers={1,2,3};
        MyMath math=new MyMath();
        int result=math.calculateSum(numbers);
        assertEquals(6,result);
    }
    @Test
    void calculateSumZero() {
        int[] numbers={1,2,-3};
        MyMath math=new MyMath();
        int result=math.calculateSum(numbers);
        assertEquals(0,result);
    }
}