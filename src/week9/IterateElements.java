/*
 Write a Java program to iterate through all elements in an array list using
Iterator
 */
package week9;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
//
//        for (int i = 0; i <list.size() ; i++) {
//            System.out.println(list.get(i));
//        }
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
