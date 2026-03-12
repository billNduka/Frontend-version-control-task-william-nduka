package src.logic;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class MondaysInMonthReport
{

    public static String returnReport(String givenMonth)
    {
        int currentYear = Year.now().getValue();
        Month monthInput = Month.valueOf(givenMonth.toUpperCase());

        LocalDate date = LocalDate.of(currentYear, monthInput, 1);
        StringBuilder report = new StringBuilder("Mondays in " + monthInput + " " + currentYear + ":\n");


        boolean first = true;
        while (date.getMonth() == monthInput)
        {

            if (date.getDayOfWeek() == DayOfWeek.MONDAY)
            {
                if (!first) {
                    report.append(", ");
                }
                report.append(date);
                first = false;
            }

            date = date.plusDays(1);
        }

        return report.toString();

    }

    public static void main(String[] args)
    {
        System.out.println(returnReport("February"));

    }
}
