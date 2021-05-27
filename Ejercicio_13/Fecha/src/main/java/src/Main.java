package src;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now();
        System.out.println("("+ fecha.getYear()+"/"+fecha.getMonthValue()+"/"+fecha.getDayOfMonth()+")"
        +" ("+fecha.getHour()+":"+fecha.getMinute()+":"+fecha.getSecond()+")");
    }
}
