package javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterTest01 {
    public static void obterProximoDiaUtil(String dataM) {
        LocalDate data = LocalDate.parse(dataM);
        System.out.println("Dia de hoje: " + data.getDayOfWeek());
        if (data.getDayOfWeek() == DayOfWeek.THURSDAY ||
            data.getDayOfWeek() == DayOfWeek.FRIDAY ||
            data.getDayOfWeek() == DayOfWeek.SATURDAY ||
            data.getDayOfWeek() == DayOfWeek.SUNDAY) {
            data = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            System.out.println("Próximo dia útil: " + data.getDayOfWeek() + ", " + data);
        } else {
            data = data.plusDays(1);
            System.out.println("Próximo dia útil: " + data.getDayOfWeek() + ", " + data);
        }
    }

    public static void main(String[] args) {
        String dataM = "2025-05-13";
        obterProximoDiaUtil(dataM);
    }
}