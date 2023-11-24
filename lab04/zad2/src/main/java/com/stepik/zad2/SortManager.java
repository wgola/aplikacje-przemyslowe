package com.stepik.zad2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SortManager {

    private final SortAlgorithm sortAlgorithm;

    public SortManager(@Qualifier("BubbleSort") SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int[] performSort(int[] arr) {
        return sortAlgorithm.sort(arr);
    }
}
