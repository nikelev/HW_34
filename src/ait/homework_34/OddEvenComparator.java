package ait.homework_34;

import java.util.Comparator;

public class OddEvenComparator implements Comparator<Integer > {

    //Задача 1
//
//Напишите OddEvenComparator, реализующий Comparator с методом сравнения
// для сортировки массива целых чисел в следующем порядке:
// Четные целые числа должны идти перед нечетными числами.
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1%2-o2%2;
    }
    //Задача 2 (повышенной сложности)
    //
    //Обновите OddEvenComparator методом сравнения для сортировки
    // массива целых чисел в следующем порядке: Четные целые числа
    // должны идти перед нечетными числами в порядке возрастания.
    // Нечетные целые числа должны идти после четных в порядке убывания.
    // Напишите тестовый пример Junit для OddEvenComparator.

//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o1%2-o2%2;
//    }





}
