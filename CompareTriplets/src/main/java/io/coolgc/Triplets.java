package io.coolgc;

import java.util.Arrays;
import java.util.List;

public class Triplets {

    public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int resultA = 0;
        int resultB = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).compareTo(b.get(i)) > 0) {
                resultA += 1;
            } else if (a.get(i).compareTo(b.get(i)) < 0) {
                resultB += 1;
            }
        }
        return Arrays.asList(resultA, resultB);
    }
}
