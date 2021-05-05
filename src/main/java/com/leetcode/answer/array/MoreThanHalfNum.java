package com.leetcode.answer.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MoreThanHalfNum {

    public int MoreThanHalfNum_Solution(int [] array) {



        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int tmp : array) {

            Integer tmpVal =  map.get(tmp);
            if(tmpVal == null) {
                tmpVal = 0;
            }
            tmpVal += 1;

            map.put(tmp, tmpVal);
        }

        Set<Integer> keys = map.keySet();

        for(Integer key : keys) {

            if(map.get(key) > array.length / 2) {
                return key;
            }
        }


        return 0;

    }
}
