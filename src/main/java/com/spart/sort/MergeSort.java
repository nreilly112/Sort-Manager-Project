package com.spart.sort;

public class MergeSort {
    void merge(int ints[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = ints[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = ints[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                ints[k] = L[i];
                i++;
            }
            else {
                ints[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            ints[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            ints[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts ints[l..r] using
    // merge()
    void sort(int ints[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(ints, l, m);
            sort(ints, m + 1, r);

            // Merge the sorted halves
            merge(ints, l, m, r);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int ints[])
    {
        int n = ints.length;
        for (int i = 0; i < n; ++i)
            System.out.print(ints[i] + " ");
        System.out.println();
    }
}
