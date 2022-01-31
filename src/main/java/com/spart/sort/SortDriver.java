package com.spart.sort;

import java.util.Arrays;

public class SortDriver {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int ints[] = {4,5,33,8,34,32,6};
        int intr[] = bs.bubbleSort(ints);
        System.out.println("here");
        System.out.println(Arrays.toString(intr));
    }
}
