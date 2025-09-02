package javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Locale localItalia = new Locale("it","IT");
        Locale localSuica = new Locale("it","CH");
        Locale localBrasil = new Locale("pt","BR");
        Locale localPortugal = new Locale("pt","PT");
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localItalia);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localBrasil);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localPortugal);
        System.out.println("Itália: " + df1.format(calendar.getTime()));
        System.out.println("Suíça: " + df2.format(calendar.getTime()));
        System.out.println("Brasil: " + df3.format(calendar.getTime()));
        System.out.println("Portugal: " + df4.format(calendar.getTime()));

    }
}
