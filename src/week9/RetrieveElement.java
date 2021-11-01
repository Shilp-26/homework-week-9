/*
 Write a Java program to retrieve an element (at a specified index) from a given
array list
 */
package week9;

import java.util.ArrayList;

public class RetrieveElement {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Audi");

        System.out.println(cars.get(2));    }
}
