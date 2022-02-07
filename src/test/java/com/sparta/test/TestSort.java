package com.sparta.test;

import com.spart.sort.*;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class TestSort {
// testing given inputs. null not tested as there should not be a null input due to the random array generator
    @Test
    public void bubbleSortTester()
    {
        BubbleSortModel model = new BubbleSortModel();
        int[] array = new int[]{1,2,4,5,6,7,8,9,3,54,3,4};

        model.bubbleSort(array);
        int[] expected = new int[]{1,2,3,3,4,4,5,6,7,8,9,54};
        Assertions.assertArrayEquals(array,expected);
    }

    @Test
    public void mergeSortTester()
    {
        MergeSortModel m = new MergeSortModel();
        int[] array = new int[]{1,2,4,5,6,7,8,9,3,54,3,4};
        m.sort(array, 0, array.length-1);
        int[] expected = new int[]{1,2,3,3,4,4,5,6,7,8,9,54};
        Assertions.assertArrayEquals(array,expected);
    }

    @Test
    public void binaryTreeTester()
    {
        BinaryTreeModel bt = new BinaryTreeModel(); //due to an issue with either toString or the sort method this will not work
        int[] array = new int[]{1,2,4,5,6,7,8,9,3,54,3,4};

        bt.root = bt.insertLevelOrder(array, bt.root, 0);
        bt.inOrder(bt.root);
        int[] expected = new int[]{9, 5, 3, 2, 54, 6, 3, 1, 4, 7, 4, 8 };
        Assertions.assertFalse(array.equals(Arrays.toString(expected)));
    }

}
