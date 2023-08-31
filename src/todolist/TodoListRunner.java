package todolist;

import java.util.Scanner;

public class TodoListRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int number;
//        do {
//            printMenu();
//            number = inputNumberMenu (scanner);
//            switch (number){
//                case 1 -> performOperationAdd(scanner); обращение к методу
//                case 2 -> performOperationEdit(scanner);
//                case 3 -> performOperationCancel(scanner);
//                case 4 -> performOperationComplete(scanner);
//                case 5 -> performOperationDelete(scanner);
//                case 6 -> performOperationShortReview(scanner);
//                case 7 -> performOperationDetail(scanner);
//            }
//        } while (number !=0);
//        writeSerialzedToDoList (todoList);
//        todoList = (List<TodoItem>) readDeserializedToDoList();
//        ToDoList toDoList = new ToDoList();
//        System.out.println(todolist);
//        System.out.println(EnumStatus.values());

        Service service = new Service();
        service.switches("");

            }


        }


