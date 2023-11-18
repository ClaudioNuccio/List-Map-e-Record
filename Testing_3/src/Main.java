import org.junit.Assert;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Main {
    public static String dateOfItaly(OffsetDateTime date){
        String result = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("The date in italy is " + result);
        return result;
    }

    public static void main(String[] args) {
        OffsetDateTime sample = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        dateOfItaly(sample);
    }
    }