/*
Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name
 */
package week9;

import java.util.HashMap;
import java.util.Map;

public class TubeLine {
    public static void main(String[] args) {

        Map<String, String> list = new HashMap<>();
        list.put("Aldgate ", "Metropolitan line");
        list.put("Aldgate East", "Hammersmith and city line, Distric Line");
        list.put("Angel", "Northern line");
        list.put("Baker Street", "Metropolitan line, Bakerloo line, Central Line,\n " +
                "Hammersmith and city line, Jubilee line");
        list.put("Bank", "Waterloo and city line, Northern Line, Central Line");
        list.put("Barbican", "Hammersmith and city line, Metropolitan Line");
        list.put("Battersea power station", "Northern Line");
        list.put("Bayswater", "District Line, Circle Line");
        list.put("Blackfriars", "District Line, Circle Line");
        list.put("Bond Street", "Jubilee Line, Central Line");
        list.put("Borough", "Northern Line");
        list.put("Cannon Street", "District Line, Circle Line");
        list.put("Chancery Lane", "Central Line");
        list.put("Charing Cross", "Bakerloo Line, Northern Line");
        list.put("Covent garden", "Piccadilly Line");
        list.put("Edgware Road", "Hammersmith and city line, Circle Line,\n" +
                " District Line");
        list.put("Embankment", "District Line, Bakerloo Line, Northern Line,\n" +
                " Circle Line");
        list.put("Euston", "Northern Line, Victoria Line");
        list.put("Euston Sqaure", "Hammersmith and city line, Metropolitan Line,\n" +
                " Circle Line");
        list.put("Farringdon", "Hammersmith and city line, Metropolitan Line,\n" +
                " Circle Line");


        for (Map.Entry<String, String> tube : list.entrySet()) {
            System.out.println(tube.getKey() + " " + tube.getValue());
        }
    }
}
