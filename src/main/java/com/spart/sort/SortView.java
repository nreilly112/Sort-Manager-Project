package com.spart.sort;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortView {
    public static Logger logger = LogManager.getLogger("Sort Logger");
    public void sortV (int[] ints){
        logger.info("print sorted array");
        System.out.println(Arrays.toString(ints));

    }
}
