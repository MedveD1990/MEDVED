package homework8;

public class Accountant implements JobTitle {
    private static final String TITLE = "Accountat";

    @Override
    public String getTitle(){return TITLE; }

    @Override
    public void printWork() {
        System.out.println(JobTitle.TITLE + TITLE);
    }
}
