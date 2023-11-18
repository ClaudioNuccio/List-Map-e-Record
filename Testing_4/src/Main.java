import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {



    public static void main(String[] args) {
OffsetDateTime sample = OffsetDateTime.parse("2023-03-01T13:00:00Z");
getYear(sample);
getMonth(sample);
getDayOfMonth(sample);
getDayOfWeek(sample);

    }
    public static String getYear(OffsetDateTime exercise) {
        String year = exercise.format(DateTimeFormatter.ofPattern("YYYY").withLocale(Locale.ITALY));
        System.out.println("The year is " + year);
        return year;
    }
    public static String getMonth(OffsetDateTime exercise) {
        String month = exercise.format(DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ITALY));
        System.out.println("The month is " + month);
        return month;
    }

    public static String getDayOfMonth(OffsetDateTime exercise) {
        String dayOfMonth = exercise.format(DateTimeFormatter.ofPattern("dd").withLocale(Locale.ITALY));
        System.out.println("The day of month is " + dayOfMonth);
        return dayOfMonth;
    }
    public static String getDayOfWeek(OffsetDateTime exercise) {
        String dayOfWeek = exercise.format(DateTimeFormatter.ofPattern("EEEE").withLocale(Locale.ITALY));
        System.out.println("The day of the week is " +dayOfWeek);
        return dayOfWeek;
    }
}