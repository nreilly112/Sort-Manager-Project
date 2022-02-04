package com.spart.sort;

public class SortController {
    public static void main(String[] args) {
        BubbleSortModel bs = new BubbleSortModel();
        int ints[] = {4,5,33,8,34,32,6};
        MergeSortModel ms = new MergeSortModel();
        ms.sort(ints, 0, ints.length - 1);
        SortView sv = new SortView();
        sv.sortV(ints);

    }
}
