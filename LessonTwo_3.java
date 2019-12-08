package ru.geekbrains.java_one.lesson_b.online;

import java.lang.reflect.Array;

public class LessonTwo_3 {

    // 3) Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив
    // и умножающий числа меньше 6 на 2;

    public static void arrPrint(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int value = a[i];
            System.out.print(value + " ");
        }
    }

    public static void arrChange(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i]*2;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        arrPrint(arr);
        System.out.println(" ");

        arrChange(arr);
        arrPrint(arr);
        System.out.println(" ");

    }


}