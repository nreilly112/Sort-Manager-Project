package com.spart.sort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Random;

public class SortController {
    public static Logger logger = LogManager.getLogger("Sort Logger");
    public static void main(String[] args) {
        Random rd = new Random(); // creating Random object
        int[] ints = new int[40];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = rd.nextInt(); // storing random integers in an array
            System.out.println(Arrays.toString(ints));
        }
        logger.info("array Ints created");
        SortTypes type = UserInput.userInput();
        logger.info("user input called");

        switch(type) {
            case BUBBLE -> {
                logger.info("Bubble Sort Selected");
                long startTime = System.nanoTime();
                BubbleSortModel model = new BubbleSortModel();
                model.bubbleSort(ints);
                SortView view = new SortView();
                view.sortV(ints);
                long endTime = System.nanoTime();
                long runTime = endTime - startTime;
                System.out.println(runTime);
            }
            case MERGE -> {
                logger.info("Merge Sort Selected");
                long startTime = System.nanoTime();
                MergeSortModel model = new MergeSortModel();
                model.sort(ints,0,ints.length-1);
                SortView view = new SortView();
                view.sortV(ints);
                long endTime = System.nanoTime();
                long runTime = endTime - startTime;
                System.out.println(runTime);
            }
            case BINARY -> {
                logger.info("Binary Sort Selected");
                long startTime = System.nanoTime();
                BinaryTreeModel bt = new BinaryTreeModel();
                bt.root = bt.insertLevelOrder(ints, bt.root, 0);
                bt.inOrder(bt.root);
                long endTime = System.nanoTime();
                long runTime = endTime - startTime;
                String time = String.valueOf(runTime);
                System.out.println('\n' + time);
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
