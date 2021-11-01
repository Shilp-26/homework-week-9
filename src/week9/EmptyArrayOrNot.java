/*
Write a Java program to test an array list is empty or not. Define array list with
underground tube names
 */
package week9;

import java.util.ArrayList;

public class EmptyArrayOrNot {

    public static void main(String[] args) {
        ArrayList<String> stations = new ArrayList<>();
        stations.add("Sudbury Town");
        stations.add("Wembley Park");
        stations.add("Wembley Central");
        stations.add("Stonebridge");

        System.out.println(stations.isEmpty());
    }
}
