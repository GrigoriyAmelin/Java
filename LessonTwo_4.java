package ru.geekbrains.java_one.lesson_b.online;

public class LessonTwo_4 {

    // 4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;

    public static void arrPrint(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int value = a[i];
            System.out.print(value + " ");
        }
    }

    public static void arrMin(int[] a) {
        int box = a[0];
        for (int i = 0; i < a.length; i++) {
           if (a[i] < box) {
               box = a[i];
            }
        }
        System.out.println("Min = " + box);
    }

    public static void arrMax(int[] a) {
        int box = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > box) {
                box = a[i];
            }
        }
        System.out.println("Max = " + box);
    }

    public static void main(String[] args) {
        int[] arr = {0, 5, -2, 2, 11, 4, 5, 2, 4, 8, 9, 12};

        arrPrint(arr);
        System.out.println(" ");

        arrMin(arr);
        arrMax(arr);
    }
}