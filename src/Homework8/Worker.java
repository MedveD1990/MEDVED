package Homework8;

public class Worker implements JobTitle {
    private static final String TITLE = "Worker";

    @Override
    public String getTitle(){return TITLE; }

    @Override
    public void printWork() {
        System.out.println(JobTitle.TITLE + TITLE);
    }

}
