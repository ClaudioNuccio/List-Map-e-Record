import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {



    public static void main(String[] args) {

    }
    public String getYear(OffsetDateTime exercise) {
        String year = exercise.format(DateTimeFormatter.ofPattern("YYYY").withLocale(Locale.ITALY));
        System.out.println(year);
        return year;
    }
    public String getMonth(OffsetDateTime exercise) {
        String month = exercise.format(DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ITALY));
        System.out.println(month);
        return month;
    }

    public String getDayOfMonth(OffsetDateTime exercise) {
        String dayOfMonth = exercise.format(DateTimeFormatter.ofPattern("dd").withLocale(Locale.ITALY));
        System.out.println(dayOfMonth);
        return dayOfMonth;
    }
    public String getDayOfWeek(OffsetDateTime exercise) {
        String dayOfWeek = exercise.format(DateTimeFormatter.ofPattern("EEEE").withLocale(Locale.ITALY));
        System.out.println(dayOfWeek);
        return dayOfWeek;
    }
}