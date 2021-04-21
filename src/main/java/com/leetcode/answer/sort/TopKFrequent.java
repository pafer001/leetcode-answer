package com.leetcode.answer.sort;

import java.util.*;

public class TopKFrequent {

    public static void main(String[] args) {
        int[] array = {-1,-1};

        final int[] ints = new TopKFrequent().topKFrequent(array, 1);
        System.out.println(ints);
    }
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            final Integer integer = map.getOrDefault(num, 0) + 1;
            map.put(num, integer);
        }

        List<NumFrequent> numFrequents = new ArrayList<>();
        for (Integer key : map.keySet()) {

            final NumFrequent numFrequent = new NumFrequent();
            numFrequent.num = key;
            numFrequent.count = map.get(key);

            numFrequents.add(numFrequent);
        }


        int[] res = new int[k];
        Collections.sort(numFrequents, Comparator.comparing(NumFrequent::getCount).reversed());
        int j = 1;
        res[0] = numFrequents.get(0).getNum();
        for (int i = 1; i < numFrequents.size() && j < k; i++) {

            if (res[j-1] != numFrequents.get(i).getNum()) {
                res[j] = numFrequents.get(i).getNum();
                j++;
            }

        }

        return res;
    }

    class NumFrequent {

        int num;
        int count;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
}
