/*
Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
 */
package week9;

import java.util.ArrayList;

public class ColorsArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Green");
        list.add("Blue");
        list.add("Red");
        list.add("Yellow");
        list.add("Purple");

        for (String colors:list) {
            System.out.println(colors);
        }
        
    }
    
}
