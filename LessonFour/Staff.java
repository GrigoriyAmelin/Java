package ru.geekbrains.java_one.lesson_four.online;

public class Staff {
    String name;
    String position;
    String phone;
    int salary;
    int birthYear;

    Staff (String name, String position, String phone, int salary, int birthYear) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birthYear = birthYear;
    }

     public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return 2019 - birthYear;
    }
    public int getBirthYear() {
        return birthYear;
    }

    public String getInfo () {
        return name + "; Position - " + position + "; Phone number - " + phone + "; Salary - " +
                salary + " rub; Age - " + getAge();
    }

}
