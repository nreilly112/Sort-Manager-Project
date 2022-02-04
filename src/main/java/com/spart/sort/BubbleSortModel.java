package com.spart.sort;

public class BubbleSortModel
{
    void bubbleSort(int ints[])
        {
        int l = ints.length;
        for (int i = 0; i < l-1; i++)
            for (int j = 0; j < l-i-1; j++)
                if (ints[j] > ints[j+1])
                {
                    // swap ints
                    int n = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = n;
                }
        }

    void printArray(int ints[])
    {
        int n = ints.length;
        for (int i=0; i<n; ++i)
            System.out.print(ints[i] + " ");
        System.out.println();
    }

}

