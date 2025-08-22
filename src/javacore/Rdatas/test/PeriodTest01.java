package javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {

        LocalDate nascimento = LocalDate.parse("1999-05-27");
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);
        Period p1 = Period.between(now, nowAfterTwoYears.plusDays(7));
        Period p2 = Period.between(nascimento, now);
        System.out.println(p1);
        System.out.println(p2);

    }
}
