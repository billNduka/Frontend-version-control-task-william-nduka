import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class MondaysInMonthReport
{
    public static String returnReport(String givenMonth, String givenYear) throws InvalidDateInputException
    {
        int currentYear;
        try {
            currentYear = Integer.parseInt(givenYear);
        } catch (NumberFormatException e) {
            throw new InvalidDateInputException(
                    "Year must be a valid number.",
                    e
            );
        }

        if (currentYear < 1) {
            throw new InvalidDateInputException(
                    "Year must be greater than 0."
            );
        }

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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter given month: ");
        String month = scanner.nextLine();

        System.out.println("\nEnter given year: ");
        String year = scanner.nextLine();

        try {
            System.out.println(returnReport(month, year));
        } catch (InvalidDateInputException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
