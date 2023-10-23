package ait.arrays.test;

import ait.arrays.utils.ArrayTools;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {
    Integer[] arrNum;
    String[] arrStr;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 7, 2, 5, 1, 0};
        arrStr = new String[]{"one", "two", "three", "four", "five"};
    }

    @Test
    void testPrintArray() {
        System.out.println("==============testPrintArray================");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
    }
    @Test
    void testSearch(){
        System.out.println("==============testPrintSearch================");
        int index = ArrayTools.search(arrStr,"four");
        System.out.println("index= "+index);
         index = ArrayTools.search(arrStr,"six");
        System.out.println("index= "+index);
         index = ArrayTools.search(arrNum,4);
        System.out.println("index= "+index);
        index = ArrayTools.search(arrNum,6);
        System.out.println("index= "+index);
    }
    void testByPredicate(){
        System.out.println("==============testPrintfindByPredicate================");

        Integer num=ArrayTools.findByPredicate(arrNum,n->n<5);
        System.out.println(num);
        num=ArrayTools.findByPredicate(arrNum,n->n%5==0);
        System.out.println(num);
        String str=ArrayTools.findByPredicate(arrStr,s->s.length()==4);
        System.out.println(str);

    }
    @Test
    void testBableSort(){
        System.out.println("==============testBableSort================");
        ArrayTools.bableSort(arrNum);
        ArrayTools.printArray(arrNum);
        ArrayTools.bableSort(arrStr);
        ArrayTools.printArray(arrStr);

    }
    @Test
    void testBableSortComparator(){
        System.out.println("==============testBableSortComparator================");
        ArrayTools.bableSort(arrNum,(n1,n2)->n2-n1);
        ArrayTools.printArray(arrNum);
        ArrayTools.bableSort(arrStr, (s1,s2)->s1.length()-s2.length());
        ArrayTools.printArray(arrStr);

    }
}