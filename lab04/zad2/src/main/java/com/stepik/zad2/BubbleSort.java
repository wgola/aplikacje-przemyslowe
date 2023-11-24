package com.stepik.zad2;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component("BubbleSort")
public class BubbleSort implements SortAlgorithm {

    @Override
    public int[] sort(int[] numbers) {
        int n = numbers.length;
        int[] arr = Arrays.copyOf(numbers, n);
        int i, j, temp;
        boolean swapped;

        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }

        return arr;
    }
}
