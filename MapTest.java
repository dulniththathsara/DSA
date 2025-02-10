import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> myMap = new HashMap<>();

        // Add key-value pairs
        myMap.put("apple", 10);
        myMap.put("banana", 20);
        myMap.put("orange", 15);

        // Print the quantity of apples
        System.out.println("Quantity of apples: " + myMap.get("apple"));

        // Iterate over the map
        System.out.println("Iterating over the Map: ");
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Remove an item
        myMap.remove("banana");
        System.out.println("After removing banana:");

        // Iterate again to show the updated map
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}