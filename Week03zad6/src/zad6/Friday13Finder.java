package zad6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Friday13Finder {
    public static void printListOfAllFriday13() {
        Random random = new Random();

        // [1900, 2020]
        int year = 1900 + random.nextInt(121); //[0, 2019] -> [1900, 2021]
        // min + random.nextInt((max-min) + 1); [min, max]

        LocalDate date = LocalDate.ofYearDay(year, 13);
        while (date.getYear() == year) {
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                System.out.printf("\n%s ", date);
            }
            date = date.plusMonths(1);
        }



    }

    public static void main(String[] args) {
        printListOfAllFriday13();
    }
}
