package Homework8;

public class Director implements JobTitle {
    private static final String TITLE = "Director";

    @Override
    public String getTitle(){return TITLE; }

    @Override
    public void printWork() {
        System.out.println(JobTitle.TITLE + TITLE);
    }
}
