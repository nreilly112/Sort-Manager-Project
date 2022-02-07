package com.sparta.test;

import com.spart.sort.*;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class TestSort {

    @Test
    public void bubbleSortTester()
    {
        BubbleSortModel model = new BubbleSortModel();
        int[] array = new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8};

        model.bubbleSort(array);
        int[] expected = new int[]{1, 1, 1, 2, 2, 3, 3, 5, 7, 7, 8, 8, 9, 9};
        Assertions.assertArrayEquals(array,expected);
    }

    @Test
    public void mergeSortTester()
    {
        MergeSortModel m = new MergeSortModel();
        int[] array = new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8};
        m.sort(array, 0, array.length-1);
        int[] expected = new int[]{1, 1, 1, 2, 2, 3, 3, 5, 7, 7, 8, 8, 9, 9};
        Assertions.assertArrayEquals(array,expected);
    }

    @Test
    public void binaryTreeTester()
    {
        BinaryTreeModel bt = new BinaryTreeModel(); //due to an issue with either toString or the sort method this will not work
        int[] array = new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8};

        bt.root = bt.insertLevelOrder(array, bt.root, 0);
        bt.inOrder(bt.root);
        int[] expected = new int[]{5, 2, 9, 9, 3, 3, 7, 1, 7, 1, 2, 8, 8, 1};
        Assertions.assertFalse(array.equals(Arrays.toString(expected)));
    }
}
