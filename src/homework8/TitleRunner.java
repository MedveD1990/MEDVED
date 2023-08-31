package homework8;


public class TitleRunner {
    public static void main(String[] args) {
        JobTitle director = new Director();
        JobTitle accountant = new Accountant();
        JobTitle worker = new Worker();

        JobTitle[] jobTitles = {accountant, director, worker};

        for (JobTitle jobTitle: jobTitles){
            jobTitle.printWork();
        }



    }
}
// Прочитать про Clone (Cloneble)
