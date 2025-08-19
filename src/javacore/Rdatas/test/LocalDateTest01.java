package javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(1999, Month.JANUARY, 27);
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        agora = agora.plusDays(2);
        System.out.println(agora);
        System.out.println(date);
        System.out.println(date.getDayOfYear());
        System.out.println(date.getYear());
        System.out.println(date.getMonth());



    }
}
