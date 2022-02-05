package com.spart.sort;

public class SortController {
    public static void main(String[] args) {
        int ints[] = {1, 2, 3, 4, 5, 6, 6, 6, 6};
        SortTypes type = UserInput.userInput();
        switch(type) {
            case BUBBLE -> {
                BubbleSortModel model = new BubbleSortModel();
            }
            case MERGE -> {
                MergeSortModel model = new MergeSortModel();
            }
            case BINARY -> {
                BinaryTree bt = new BinaryTree();
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
