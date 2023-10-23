package ait.homework_34.test;

import ait.homework_34.OddEvenComparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenComparatorTest {

    Integer[] origin = {1, 4, 3, 2, 5, 6, 9, 8, 7, 3};
    Integer[] expected = {2, 4, 6, 8, 9, 7, 5, 3, 3, 1};

    @BeforeEach
    void setUp() {
    }

    @Test
    void compare() {
        Comparator<Integer> comparator = new OddEvenComparator();
        Arrays.sort(origin, comparator);
        Integer[] res = origin;
        //assertArrayEquals(expected,origin);
        for (int i = 0; i < origin.length; i++) {
            System.out.println(origin[i]);

        }




//
//        for (int i = 0; i < res.length - 1; i++) {
//            if (res[i] % 2 == 0 && res[i + 1] % 2 == 0) {
//                for (int j = 0; j < res.length - 1; j++) {
//                    int t = 0;
//                    if (res[j] > res[j + 1]) {
//                        t = res[j];
//                        res[j] = res[j + 1];
//                        res[j + 1] = t;
//
//                    }
//                }
//            }
//
//
//        }
//        for (int i = 0; i < res.length; i++) {
//            System.out.println(res[i]);
//            System.out.println();
//        }
//
   }
}