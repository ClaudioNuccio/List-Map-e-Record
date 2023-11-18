import org.junit.Assert;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Main {
    public String dateOfItaly(OffsetDateTime date){
        String result = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
    }
    }