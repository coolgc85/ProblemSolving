package io.coolgc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        TwoSum twoSum = new TwoSum();
        var resultArray = twoSum.twoSum(new int[]{2, 4, 7}, 6);
        int[] expected = {0, 1};
        Assertions.assertArrayEquals(expected, resultArray);
    }
}