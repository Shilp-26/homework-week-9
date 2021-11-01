/*
Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map
 */
package week9;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, Integer> people = new java.util.HashMap<>();
        people.put("John", 25);
        people.put("Bob", 19);
        people.put("Sam", 27);

        for (Map.Entry<String, Integer> p : people.entrySet()) {
            System.out.println(p.getKey() + " " + p.getValue());
        }

    }
}
