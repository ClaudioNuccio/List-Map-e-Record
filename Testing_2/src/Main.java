import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public  String printFull (OffsetDateTime string){
        String printFull = string.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(printFull);
       return printFull;
    }
    public  String printMedium (OffsetDateTime string){
        String printMedium = string.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(printMedium);
        return printMedium;
    }public  String printShort (OffsetDateTime string){
        String printShort = string.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(printShort);
        return printShort;
    }

    public static void main(String[] args) {

    }

}
