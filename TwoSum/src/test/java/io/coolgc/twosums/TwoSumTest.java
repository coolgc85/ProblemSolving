package io.coolgc.twosums;


import java.util.Arrays;


import io.coolgc.SolutionTwoSums;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionSolutionTwoSumsTest {


    @Test
    void twoSumThreeElements() {
        SolutionTwoSums s = new SolutionTwoSums();
        var result = s.twoSum(new int[]{2, 3, 4},7);
        var expected = new int[]{1,2};
        System.out.println(Arrays.toString(result));
        Assertions.assertArrayEquals(expected,result);
    }


    @Test
    void SmallArray_TargetNine() {
        SolutionTwoSums s = new SolutionTwoSums();
        var result = s.twoSum(new int[]{2,7,11,15},9);
        var expected = new int[]{0,1};
        System.out.println(Arrays.toString(result));
        Assertions.assertArrayEquals(expected,result);


    }


    @Test
    void BigArray_TargetSeventeen() {
        SolutionTwoSums s = new SolutionTwoSums();
        int[] result = s.twoSum(new int[]{4,6,8,9,20,32,35,36,44,55},17);
        System.out.println(Arrays.toString(result));
        var expected = new int[]{2,3};
        Assertions.assertArrayEquals(expected,result);


    }


    @Test
    void targetSix() {
        SolutionTwoSums s = new SolutionTwoSums();
        int[] result = s.twoSum(new int[]{3,2,4},6);
        System.out.println(Arrays.toString(result));
        var expected = new int[]{1,2};
        Assertions.assertArrayEquals(expected,result);


    }


    @Test
    void repeatedPair() {
        SolutionTwoSums s = new SolutionTwoSums();
        int[] result = s.twoSum(new int[]{3,3},6);
        System.out.println(Arrays.toString(result));
        var expected = new int[]{0,1};
        Assertions.assertArrayEquals(expected,result);


    }


}
