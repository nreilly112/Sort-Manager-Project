package com.spart.sort;

import java.util.Arrays;

public class SortDriver {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int ints[] = {4,5,33,8,34,32,6};
        bs.bubbleSort(ints);
        System.out.println("bubble sort");
        bs.printArray(ints);
        MergeSort ms = new MergeSort();
        ms.sort(ints, 0, ints.length - 1);
        System.out.println("\nmerge sort");
        ms.printArray(ints);

    }
}
