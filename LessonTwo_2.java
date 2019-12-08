package ru.geekbrains.java_one.lesson_b.online;

import java.lang.reflect.Array;

public class LessonTwo_2 {

    // 2) Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его
    // значениями 1 4 7 10 13 16 19 22;

    public static void arrPrint(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int value = a[i];
            System.out.print(value + " ");
        }
    }

    public static void arrChange(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 && i == 0) {
                a[i] = 1;
            } else {
                a[i] = a[i-1]+3;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[8];

        arrPrint(arr);
        System.out.println(" ");

        arrChange(arr);

        arrPrint(arr);
        System.out.println(" ");

    }


}