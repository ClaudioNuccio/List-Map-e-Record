import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static String printFull (OffsetDateTime string){
        String printFull = string.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("The date in the FULL format is " + printFull);
       return printFull;
    }
    public static String printMedium (OffsetDateTime string){
        String printMedium = string.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("The date in the MEDIUM format is " + printMedium);
        return printMedium;
    }public static String printShort (OffsetDateTime string){
        String printShort = string.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("The date in the SHORT format is " + printShort);
        return printShort;
    }

    public static void main(String[] args) {
        OffsetDateTime sample = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        printFull(sample);
        printMedium(sample);
        printShort(sample);
    }
}
