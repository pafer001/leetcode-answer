package com.offer.answer._11;


public class MinArray {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 3};
        final int i = new MinArray().minArray(numbers);
        System.out.println(i);
    }

    public int minArray(int[] numbers) {

        int left = 0;
        int right = numbers.length - 1;

        while (right > left) {
            if (right - left == 1) {
                return min(numbers[left], numbers[right]);
            }
            int mid = (left + right) / 2;

            if (numbers[left] > numbers[mid]) {
                right = mid;
            }
            if (numbers[right] < numbers[mid]) {
                left = mid;
            }

            if (numbers[left] == numbers[right] || numbers[left] == numbers[mid]) {
                int small = numbers[left];
                for (int i = left; i <= right; i++) {

                    if (numbers[i] < small) {
                        small = numbers[i];
                    }
                }

                return small;
            }

            if (numbers[left] <= numbers[mid] && numbers[right] >= numbers[mid]) {
                return numbers[left];
            }
        }
        return numbers[left];


    }

    private int min(int a, int b) {

        if (a > b) {
            return b;
        }
        return a;
    }

}
