package homeWork7;

//2. Стипендия
//        Создайте пример наследования, реализуйте класс Student и класс Aspirant.
//        Аспирант отличается от студента наличием научной работы.
//        Класс Student содержит переменные: firstName, lastName, group, averageMark.
//        Базовая стипендия: 10 рублей.
//        Стипендия студента: если средняя оценка студента равна 5, то сумма 50 рублей, иначе базовая стипендия.
//        Стипендия аспиранта: если средняя оценка аспиранта равна 5, то сумма в два раза выше студенческой, иначе базовая стипендия.
//        Создать массив типа Student, содержащий объекты класса Student и Aspirant.
//        Отобразить сумму стипендии для всех студентов в массиве.

import java.util.Arrays;
import java.util.Scanner;

public class StudentsRunner {
    public static void main(String[] args) {
        Student st1  = new Student("Vlad", "Ignatov", 1, 5);
        Student st2  = new Student("Ignat", "Vladov", 2, 4);
        Aspirant as1 = new Aspirant("Lera","Katina", 3, 5, true);
        Aspirant as2 = new Aspirant("Katya","Lerina", 4, 4, false);
        Student [] students = new Student[4];
        students [0] =st1;
        students [1] =st2;
        students [2] =as1;
        students [3] =as2;


        System.out.println(Arrays.toString(students));


    }
}
