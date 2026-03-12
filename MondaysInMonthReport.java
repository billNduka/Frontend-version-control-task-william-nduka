import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class MondaysInMonthReport
{

    public static String returnReport(String givenMonth) throws InvalidDateInputException
    {
        int currentYear = Year.now().getValue();

        Month monthInput;
        try {
            monthInput = Month.valueOf(givenMonth.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new InvalidDateInputException(
                "Invalid month. Please enter a valid month name (e.g., January).",
                    e
            );
        }

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
        try {
            System.out.println(returnReport("February"));
        } catch (InvalidDateInputException e) {
            System.err.println(e.getMessage());
        }

    }
}
