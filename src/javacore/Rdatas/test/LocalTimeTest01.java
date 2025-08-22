package javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(10, 23);
        LocalTime localTimeAgora = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTimeAgora);
        System.out.println(localTimeAgora.MIN);
        System.out.println(localTimeAgora.MAX);
        System.out.println(localTimeAgora.getHour() + ":" + localTimeAgora.getMinute() + ":" + localTimeAgora.getSecond());

    }
}
