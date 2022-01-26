package io.coolgc;


import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;


class TripletsTest {

    @Test
    void compareTriplets() {

         List<Integer> a = Arrays.asList(17,28,30);
         List<Integer> b = Arrays.asList(99,16,8);
        Triplets t = new Triplets();

        Assertions.assertFalse(t.compareTriplets(a, b).isEmpty());
    }
}