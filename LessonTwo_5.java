package ru.geekbrains.java_one.lesson_b.online;

public class LessonTwo_5 {

    // 5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его
    // диагональные элементы единицами, используя цикл(ы);

    public static void arrPrint(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int value = a[i][j];
                System.out.print(value + "\t");
            }
            System.out.println(" ");
        }
    }

    public static void arrChange(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i==j) {
                    a[i][j] = 1;
                } else {
                    if (i+j == a.length-1) {
                        a[i][j] = 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{5, 5, -5, 6, 88}, {3, 2, 0, 2, 88}, {1, 8, 11, 4, -7}, {4, 5, 70, 6, -5}, {0, -8, -1, 11, 77}};

        arrPrint(arr);
        System.out.println(" ");

        arrChange(arr);
        arrPrint(arr);
        System.out.println(" ");

    }


}