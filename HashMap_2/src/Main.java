import java.util.*;

public class Main {
    public static void main(String[] args){
        Map<String, String> emptyCities2 = Map.of();
        Map<String, String> cities2 = new HashMap<String, String>(Map.of("PA", "Palermo",
                "RO", "Roma",
                "TO", "Torino")
        );

        List<String> sortedMap = new ArrayList<>(cities2.values());
        Collections.sort(sortedMap);
        System.out.println(sortedMap);
    }
}