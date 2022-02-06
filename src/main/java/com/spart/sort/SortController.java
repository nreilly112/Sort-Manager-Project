package com.spart.sort;

public class SortController {
    public static void main(String[] args) {
        int ints[] = {6,7,4,6,4,3,5,5,74,6,7};
        SortTypes type = UserInput.userInput();

        switch(type) {
            case BUBBLE -> {
                BubbleSortModel model = new BubbleSortModel();
                model.bubbleSort(ints);
                SortView view = new SortView();
                view.sortV(ints);
            }
            case MERGE -> {
                MergeSortModel model = new MergeSortModel();
                model.sort(ints,0,ints.length);
                SortView view = new SortView();
                view.sortV(ints);
            }
            case BINARY -> {
                BinaryTreeModel bt = new BinaryTreeModel();
                bt.root = bt.insertLevelOrder(ints, bt.root, 0);
                bt.inOrder(bt.root);
            }
            case NULL ->{
                System.out.println("Error");
                System.exit(0);
            }
        }

    }
}
