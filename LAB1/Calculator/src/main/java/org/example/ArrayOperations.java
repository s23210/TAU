package org.example;

import java.util.Arrays;

public class ArrayOperations {
    public int[] reverseArray(int[] array) {
        int[] reversed = Arrays.copyOf(array, array.length);
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = reversed[i];
            reversed[i] = reversed[j];
            reversed[j] = temp;
        }
        return reversed;
    }

    public int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}

