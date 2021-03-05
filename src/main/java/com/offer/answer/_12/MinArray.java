package com.offer.answer._12;

public class MinArray {

    public int minArray(int[] numbers) {

        int left = 0;
        int right = numbers.length - 1;

        while (right > left) {
            int mid = (left + right) / 2;

            if (numbers[left] > numbers[mid]) {
                right = mid;
//            mid = (left + right)/2;
            }
            if (numbers[right] < numbers[mid]) {
                right = mid;
//            mid = (left + right)/2;
            }
        }
        return numbers[left];


    }
}
