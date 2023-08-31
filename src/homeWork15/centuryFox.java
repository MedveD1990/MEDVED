package homeWork15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class centuryFox {
    public static void main(String[] args) {

        System.out.println("Input B-day in format: yyyy-mm-dd: ");
        Scanner scanner = new Scanner(System.in);
        String birthDay = scanner.next();
        LocalDate bDay = LocalDate.parse (birthDay);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd - MMMM - yyyy");
        System.out.println("Ровно век с вашего начала состоится " + dateTimeFormatter.format(bDay.plusYears(100)));





    }

}
