import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public String exercise (OffsetDateTime data, int year, int month, int day){
        String addedTime = data.plusYears(year).minusMonths(month).plusDays(day).format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
       return addedTime;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}