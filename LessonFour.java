package ru.geekbrains.java_one.lesson_four.online;

public class LessonFour {
    public static void main (String[] args) {
        // 1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
        // 2 Конструктор класса должен заполнять эти поля при создании объекта;
        // 3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
        // 4 Вывести при помощи методов из пункта 3 ФИО и должность.
        // 5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        // 6 * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
        // 7 *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный
        // идентификационный порядковый номер

        Staff s = new Staff ("Ivan", "Manager", "11-21", 35000, 1980);

        System.out.println("Case 1: " + s.getName() + "; Position - " + s.getPosition());

        Staff[] personnel = {
                s,
                new Staff ("Maria", "General manager", "10-00", 70000, 1975),
                new Staff ("Gleb", "Developer", "05-21", 44000, 1974),
                new Staff ("Elena", "Chief", "05-31", 34000, 1987),
                new Staff ("Alik", "Tester", "05-22", 24000, 1989)
        };

        for (int i = 0; i < personnel.length; i++) {
           if (personnel[i].getAge() > 40) {
               System.out.println("Case 2: " + personnel[i].getInfo());
           }
       }
    }
}
