package com.spart.sort;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserInput {
    public static Logger logger = LogManager.getLogger("Sort Logger");
    public static SortTypes userInput() {
        Scanner chosenSort = new Scanner(System.in);
        System.out.println("Which sort would you like to use?");
        logger.info("get user input");
        String sort = chosenSort.nextLine();
        System.out.println(sort);
        if(sort == null){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        if(sort.equals("Bubble Sort")){
            logger.info("Bubble Sort Selected");
            return SortTypes.BUBBLE;
        }
        if(sort.equals("Merge Sort")){
            logger.info("Merge Sort Selected");
            return SortTypes.MERGE;
        }
        if(sort.equals("Binary Tree Sort")){
            logger.info("Binary Tree Sort Selected");
            return SortTypes.BINARY;
        }
        return SortTypes.NULL;

    }

}
