package todolist;

import java.time.LocalDateTime;


public class Task {
    private int number; //last element number + 1
    private String name;
    private LocalDateTime time;
    private LocalDateTime lastEditTime;
    private LocalDateTime endTime;
    private String caseStatus; //(Enum создать)

}
