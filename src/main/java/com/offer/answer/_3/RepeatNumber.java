package com.offer.answer._3;

public class RepeatNumber {

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 0, 1, 5, 3};

        final int repeatNumber = new RepeatNumber().findRepeatNumber(array);
        System.out.println(repeatNumber);

    }

    public int findRepeatNumber(int[] array) {

        for (int i = 0; i <= array.length - 1; i++) {

            int tmp = array[i];
            if (tmp == i) {
                continue;
            }

            if (array[tmp] == tmp) {
                return tmp;
            }
            swap(array, i, tmp);

        }

        return -1;
    }

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
