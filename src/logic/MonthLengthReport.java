package src.logic;

import java.time.Month;
import java.time.Year;

public class MonthLengthReport
{
    public static String returnReport(int givenYear)
    {
        Year year = Year.of(givenYear);
        StringBuilder report = new StringBuilder("Month lengths for year ");

        report.append(year);

        for (Month month : Month.values())
        {
            int length = month.length(year.isLeap());
            report.append(":\n").append(month).append(" : ").append(length).append(" days");
        }

        return report.toString();
    }

    public static void main(String[] args)
    {

        System.out.println(returnReport(2025));
    }
}

