package com.spart.sort;

public class SortController {
    public static void main(String[] args) {
        BubbleSortModel bs = new BubbleSortModel();
        int ints[] = {1, 2, 3, 4, 5, 6, 6, 6, 6};
        MergeSortModel ms = new MergeSortModel();
        ms.sort(ints, 0, ints.length - 1);
        SortView sv = new SortView();
        sv.sortV(ints);
        BinaryTree bt = new BinaryTree();
        bt.root = bt.insertLevelOrder(ints, bt.root, 0);
        bt.inOrder(bt.root);

    }
}
