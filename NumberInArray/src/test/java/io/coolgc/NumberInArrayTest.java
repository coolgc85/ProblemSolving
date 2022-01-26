package io.coolgc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberInArrayTest {

    @Test
    void numberInArrayExist() {
        int[] ints = {-9,14,37,102};
        NumberInArray nia = new NumberInArray();
       Assertions.assertTrue(nia.existIn(ints, 14));
    }

    @Test
    void numberInArrayNoExist() {
        int[] ints = {-9,14,37,102};
        NumberInArray nia = new NumberInArray();
        Assertions.assertFalse(nia.existIn(ints, 11));
    }

    @Test
    void emptyArray() {
        int[] ints = {,};
        NumberInArray nia = new NumberInArray();
        Assertions.assertFalse(nia.existIn(ints, 11));
    }

    @Test
    void onlyOneElementExistTrue() {
        int[] ints = {12};
        NumberInArray nia = new NumberInArray();
        Assertions.assertFalse(nia.existIn(ints, 12));
    }

    @Test
    void onlyOneElementExistFalse() {
        int[] ints = {12};
        NumberInArray nia = new NumberInArray();
        Assertions.assertFalse(nia.existIn(ints, 112));
    }
}