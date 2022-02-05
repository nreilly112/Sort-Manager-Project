package com.spart.sort;
import java.util.Scanner;

public class UserInput {
    public static SortTypes userInput() {
        Scanner chosenSort = new Scanner(System.in);
        System.out.println("Which sort would you like to use?");
        if(chosenSort.nextLine() == null){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        if(chosenSort.nextLine().equals("Bubble Sort")){
            return SortTypes.BUBBLE;
        }
        if(chosenSort.nextLine().equals("Merge Sort")){
            return SortTypes.MERGE;
        }
        if(chosenSort.nextLine().equals("Binary Tree Sort")){
            return SortTypes.BINARY;
        }
        return SortTypes.NULL;

    }

}
