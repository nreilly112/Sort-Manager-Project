package com.spart.sort;
import java.util.Scanner;

public class UserInput {
    public static SortTypes userInput() {
        Scanner chosenSort = new Scanner(System.in);
        System.out.println("Which sort would you like to use?");
        String sort = chosenSort.nextLine();
        System.out.println(sort);
        if(sort == null){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        if(sort.equals("Bubble Sort")){
            return SortTypes.BUBBLE;
        }
        if(sort.equals("Merge Sort")){
            return SortTypes.MERGE;
        }
        if(sort.equals("Binary Tree Sort")){
            return SortTypes.BINARY;
        }
        return SortTypes.NULL;

    }

}
