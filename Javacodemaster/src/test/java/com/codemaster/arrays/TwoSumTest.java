package com.codemaster.arrays;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void testTwoSum() {
        TwoSum solver = new TwoSum();
        assertArrayEquals(new int[] { 0, 1 }, solver.twoSum(new int[] { 2, 7, 11, 15 }, 9));
    }
}