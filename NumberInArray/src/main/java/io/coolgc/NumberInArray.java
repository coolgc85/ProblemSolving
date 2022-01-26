package io.coolgc;

import java.util.Arrays;

public class NumberInArray {

    public boolean existIn(int[] arrayObj, int n){

        if(arrayObj != null && arrayObj.length>0){
           return Arrays.binarySearch(arrayObj,n) > 0;
         }

        return false;
    }

}
