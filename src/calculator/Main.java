package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        char op;
        String answer;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number");
            x = sc.nextInt();

            System.out.println("Enter the second number");
            y = sc.nextInt();

            System.out.println("Enter the operator");
            op = sc.next().charAt(0);

            Calculator calc = new Calculator();
            calc.calculateResult(x, y, op);

            System.out.println("“Would you like to do \n" +
                    "more calculation Please enter “Y” or “N” :");
            answer = sc.next();
        } while (answer.equals("Y"));

    }
}
