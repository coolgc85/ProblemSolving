package io.coolgc;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        AtomicInteger atomicInteger = new AtomicInteger();
        List<Integer> resultList = new ArrayList<>();
        var resultMap = Arrays.stream(nums).mapToObj(Integer::valueOf)
                .collect(Collectors.toMap(Function.identity(), i -> atomicInteger.getAndIncrement()));
        var entryIterator = resultMap.entrySet().iterator();
        //TODO: logic to find the complement


        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }


}
