import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static String exercise (OffsetDateTime data, int year, int month, int day){
        String addedTime = data.plusYears(year).minusMonths(month).plusDays(day).format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println(addedTime);
       return addedTime;
    }

    public static void main(String[] args) {
        OffsetDateTime sample = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        exercise(sample,1,1,7);
    }
}