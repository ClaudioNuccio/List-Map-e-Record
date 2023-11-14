import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> cities = new HashMap<>();
        cities.put("PA", "Palermo");
        cities.put("RO", "Roma");
        cities.put("TO", "Torino");
        Map<String, String> emptyCities2 = Map.of();
        Map<String, String> cities2 = new HashMap<String, String>(Map.of("PA", "Palermo", "RO", "Roma", "TO", "Torino"));

        Map<String, String> cities3 = new HashMap<String, String>(Map.ofEntries(
                new AbstractMap.SimpleEntry<String, String>("PA", "Palermo"),
                new AbstractMap.SimpleEntry<String, String>("RO", "Roma"),
                new AbstractMap.SimpleEntry<String, String>("TO", "Torino")
        )
        );
        System.out.println(cities);
        System.out.println(cities2);
        System.out.println(cities3);
    }
}