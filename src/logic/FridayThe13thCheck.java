package src.logic;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayThe13thCheck
{
    public static String check(LocalDate givenDate)
    {
        StringBuilder report = new StringBuilder(givenDate.toString());
        if (givenDate.getDayOfWeek() == DayOfWeek.FRIDAY && givenDate.getDayOfMonth() == 13)
        {
            report.append(" is Friday the 13th!");
        } else
        {
            report.append(" is NOT Friday the 13th.");
        }

        return report.toString();
    }

    public static void main(String[] args)
    {

        LocalDate date = LocalDate.of(2026, 2, 13);

        System.out.println(check(date));
    }
}
