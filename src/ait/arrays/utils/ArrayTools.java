package ait.arrays.utils;

import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayTools {
    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("=========================================");
    }

    public static <T> int search(T[] arr, T value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> T findByPredicate(T[] arr, Predicate<T> pedicate) {
        for (int i = 0; i < arr.length; i++) {
            if (pedicate.test(arr[i])) {
                return arr[i];
            }
        }return null;
    }
    public static <T extends Comparable <T  >> void bableSort (T[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j].compareTo(arr[j+1])>0){
                    T t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }

    public static <T > void bableSort (T[]arr, Comparator<T> comparator){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (comparator.compare(arr[j],arr[j+1])>0){
                    T t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
    public static  <T >int binarySearch(T[] arr, T value,Comparator<T> comparator) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == value) {
                return mid;
            }
            if (comparator.compare(value,arr[mid])  >0 ) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -l-1;
    }

    public static <T extends Comparable <T  >>int binarySearch(T[] arr, T value) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid].compareTo(value)==0 ) {
                return mid;
            }
            if (value.compareTo(arr[mid]) > 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -l-1;
    }




}
