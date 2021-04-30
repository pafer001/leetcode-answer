package com.leetcode.answer.array;

import java.util.Arrays;
import java.util.Comparator;

public class TwoSum {

    public static void main(String[] args) {

        int[] numbers = {3, 2, 4};
        final int[] ints = new TwoSum().twoSum(numbers, 6);
        System.out.println(ints);
    }

    public int[] twoSum(int[] numbers, int target) {
        // write code here
        int low = 0;
        int high = numbers.length - 1;

        Node[] nodeArray = new Node[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            Node node = new Node();
            node.index = i;
            node.value = numbers[i];
            nodeArray[i] = node;
        }
//         Arrays.sort(nodeArray,  (Node node1, Node node2) -> node1.value > node1.value);
        Arrays.sort(nodeArray, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.value - o2.value;
            }
        });

        while (high > low) {

            int sum = nodeArray[low].value + nodeArray[high].value;
            if (sum == target) {

                return nodeArray[low].index < nodeArray[high].index ?
                        new int[]{nodeArray[low].index + 1, nodeArray[high].index + 1} : new int[]{nodeArray[high].index + 1, nodeArray[low].index + 1};

            } else if (sum > target) {
                high--;
            } else {
                low++;
            }

        }

        return new int[]{};

    }

    class Node {
        int index;
        int value;
    }
}
