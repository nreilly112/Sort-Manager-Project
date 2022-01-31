package com.spart.sort;

public class BubbleSort
{
    public int[] bubbleSort(int[] ints){
        int l = ints.length;
        for(int i = 0; i<l-1;i++){
            for(int j = 0; j < l-1; j++){
                if(ints[j] < ints[i+1]){
                    int n = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = n;
                }
            }

        }
       return ints;
    }

}

