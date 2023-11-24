package com.stepik.zad2;

import java.util.Arrays;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component("BogoSort")
public class BogoSort implements SortAlgorithm {

    @Override
    public int[] sort(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);

        while (!isSorted(copy)) {
            shuffleArray(copy);
        }

        return copy;
    }

    private boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    private void shuffleArray(int[] arr) {
        int n = arr.length;
        Random rand = new Random();
        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
