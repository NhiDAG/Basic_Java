
package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Market{

    public static void main(String[] args) {
        // Create a LinkedHashMap.
        LinkedHashMap<String, Integer> fruit = new LinkedHashMap<>();

        // Add elements with a specific order.
        fruit.put("Apple", 15);
        fruit.put("Grape", 30);
        fruit.put("Mango", 20);

        fruit.put("Banana", 10);
        String newItem = "Banana";
        int bananaPrice = fruit.get(newItem);
        System.out.println( newItem + "'s price: " + bananaPrice);

        // Iterate through the LinkedHashMap without handling exceptions.
        System.out.println("Iterating through the LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : fruit.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

