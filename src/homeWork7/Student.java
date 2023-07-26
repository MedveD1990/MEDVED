package homeWork7;

public class Student {
    public String firstName;
    public String  lastName;
    public int group;
    public int averageMark;
    public int stipendia = 10;
    public int stipendiaUp = 50;
    public Student (String firstName, String lastName, int group, int averageMark){
        this. firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;

    }
    public int Moneys(){
        if (averageMark >=5){
            return stipendiaUp;
        }else {
            return stipendia;
        }
    }

    }
