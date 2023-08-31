package todolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Service {

    // Проверка на вход в меню

    public static Integer inputNumberMenu(Scanner scanner) {
        Integer number = null;
        while (number == null) {
            try {
                number = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input number!");
                try {
                    number = Integer.valueOf(scanner.nextLine());
                } catch (NumberFormatException e1) {
                    System.out.println("Input number! Please!");
                }
            }
        }
        return number;
    }
    // Номер задания

    public static Integer inputCaseNumber(Scanner scanner) {
        System.out.println("Enter number to-do");
        Integer caseNumber = null;
        while (caseNumber == null) {
            try {
                caseNumber = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input number!");
                try {
                    caseNumber = Integer.valueOf(scanner.nextLine());
                } catch (NumberFormatException e1) {
                    System.out.println("Input number! Please!");
                }
            }
        }
        return caseNumber;
    }
    // Имя
    public static String inputTask(Scanner scanner) {
        System.out.println("Enter to-do name");
        String task = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\w+\\d+ {25}");
        Matcher matcher = pattern.matcher(task);
        while (matcher.find()) {
            matcher.group();
        }
        return task;
    }
    // Описание
    public static String inputDescription(Scanner scanner) {
        System.out.println("Enter description");
        String description = scanner.nextLine();
        return description;
    }

    public String switches (String name1) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1: {
                System.out.println("Input name");
                String name = scanner.next();
            }
            case 2: {
                System.out.println("Edit task");
                String name = scanner.next();
            }
            case 3: {
                System.out.println("Cancel task by number ");
                String name = scanner.next();
            }
            case 4: {
                System.out.println("Delete task");
                String name = scanner.next();
            }
            case 5: {
                System.out.println("Display a short list of all cases ");
                String name = scanner.next();
            }
            case 6: {
                System.out.println("Display detailed details by case number (display all fields) ");
                String name = scanner.next();
            }


        }
        return name1;
    }
    public void add(String todo) {



        // TODO: добавьте переданное дело в конец списка
    }

}





