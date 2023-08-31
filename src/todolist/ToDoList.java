package todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> list;


    public ToDoList() {
        this.list = new ArrayList<>();


    }

    public void addTaskToList (Task task){
        list.add(task);
            }


    public void editTask (int number, String name, String time, String lastEditTime, String endTime, String caseStatus){


    }


}

