package javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {

        String pattern = "'Brasil:' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdt = new SimpleDateFormat(pattern);
        System.out.println(sdt.format(new Date()));


    }
}
