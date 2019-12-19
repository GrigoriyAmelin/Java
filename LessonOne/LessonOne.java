package ru.geekbrains.java_one.lesson_a.online;

public class LessonOne {

    // Задание 1. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    // с плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода;

    public static float result(int a, int b, int c, float d) {
        return a * (b + (c / d));
    }

    // Задание 2. Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит
    // в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – falseНаписать метод,
    // принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false

    public static boolean check(int a, int b) {
        if (a+b >10 && a+b < 20) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 3. Написать метод, которому в качестве параметра передается целое число, метод должен проверить
    // положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом.
    // Результат работы метода вывести в консоль

    public static boolean checkIsNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int f = 11;
        System.out.println("Case 1: " + result(a, b, c, f)); // Задание 1
        System.out.println("Case 1: " + result(7, 8, 19, 171)); // Задание 1
        System.out.println(" ");

        System.out.println("Case 2: Сумма лежит в пределах от 10 до 20? " + check(-15, 26)); // Задание 2
        System.out.println(" ");

        System.out.println("Case 3: Ваше число отрицательное? " + checkIsNegative(-5)); // Задание 3
        System.out.println(" ");


    }
}
