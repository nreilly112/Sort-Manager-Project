package com.spart.sort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortController {
    public static Logger logger = LogManager.getLogger("Sort Logger");
    public static void main(String[] args) {
        int ints[] = {6,7,4,6,4,3,5,5,74,6,7};
        logger.info("array Ints created");
        SortTypes type = UserInput.userInput();
        logger.info("user iput called");


        switch(type) {
            case BUBBLE -> {
                logger.info("Bubble Sort Selected");
                BubbleSortModel model = new BubbleSortModel();
                model.bubbleSort(ints);
                SortView view = new SortView();
                view.sortV(ints);
            }
            case MERGE -> {
                logger.info("Merge Sort Selected");
                MergeSortModel model = new MergeSortModel();
                model.sort(ints,0,ints.length-1);
                SortView view = new SortView();
                view.sortV(ints);
            }
            case BINARY -> {
                logger.info("Binary Sort Selected");
                BinaryTreeModel bt = new BinaryTreeModel();
                bt.root = bt.insertLevelOrder(ints, bt.root, 0);
                bt.inOrder(bt.root);
            }
            case NULL ->{
                logger.error("No Type Selected");
                logger.warn("Program will exit: no type selected");
                System.out.println("Error");
                System.exit(0);
            }
        }

    }
}
