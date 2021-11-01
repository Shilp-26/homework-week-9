/*
Re write the student mark sheet programme using if else and while loop.
 */
package week9;

import java.util.Scanner;

public class MarkSheet {

    public static void main(String[] args) {
        String result = null;
        String grade = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name = sc.next();
        System.out.println("Enter Student roll no");
        String roll = sc.next();
        System.out.println("Enter Maths marks here");
        int math = sc.nextInt();
        while (!(0 <= math && math <= 100)) {
            System.out.println("Invalid input, Marks should be between 0 to 100");
            System.out.println("Please enter valid marks");
            math = sc.nextInt();
        }
        System.out.println("Enter Science marks here");
        int science = sc.nextInt();
        while (!(0 <= science && science <= 100)) {
            System.out.println("Invalid input, Marks should be between 0 to 100");
            System.out.println("Please enter valid marks");
            science = sc.nextInt();
        }
        System.out.println("Enter English marks here");
        int english = sc.nextInt();
        while (!(0 <= english && english <= 100)) {
            System.out.println("Invalid input, Marks should be between 0 to 100");
            System.out.println("Please enter valid marks");
            english = sc.nextInt();
        }

        int total = math + science + english;
        int avg = total / 3;

        if (avg >= 35) {
           result = "Pass";
        } else {
            result = "Fail";
        }
         if (avg >= 80) {
             grade = "A+";
        } else if (avg >= 60) {
             grade = "A";
        } else if (avg >= 50) {
             grade = "B";
        } else if (avg >= 35) {
             grade = "C";
        } else {
             result = "Fail";
        }
        System.out.println("-------------------------------");
        System.out.println("|                              |");
        System.out.println("|        Mark Sheet            |");
        System.out.println("|______________________________|");
        System.out.println("|    Name        :     " + name + "     |");
        System.out.println("|    Roll no     :     " + roll + "     |");
        System.out.println("|______________________________|");
        System.out.println("|    Subjects    :     Marks   |");
        System.out.println("|______________________________|");
        System.out.println("|    Math        :     " + math + "      |");
        System.out.println("|    Science     :     " + science + "      |");
        System.out.println("|    English     :     " + english + "      |");
        System.out.println("|______________________________|");
        System.out.println("|    Total       :     " + total + "     |");
        System.out.println("|                              |");
        System.out.println("|    Percentage  :     " + avg + "      |");
        System.out.println("|    Result      :     " + result + "    |");
        System.out.println("|    Grade       :     " + grade + "    |");
        System.out.println("-------------------------------");


    }
}



