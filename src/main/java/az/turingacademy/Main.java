package az.turingacademy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int preincrement = ++num1;
        int postincrement = num1++;
        int predecrement = --num2;
        int postdecrement = num2--;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Incremented first number: " + preincrement);
        System.out.println("Decremented second number: " + predecrement);
        System.out.println("Incremented first number: " + postincrement);
        System.out.println("Decremented second number: " + postdecrement);

        System.out.println("Is first number greater than second? " + (num1 > num2));
        System.out.println("Is first number less than or equal to second? " + (num1 <= num2));
        System.out.println("Are both numbers different? " + (num1 != num2));

        boolean isPositive1 = num1 > 0;
        boolean isPositive2 = num2 > 0;
        System.out.println("Are both numbers positive? " + (isPositive1 && isPositive2));
        System.out.println("Is at least one number positive? " + (isPositive1 || isPositive2));

        String result = (num1 > num2) ? "First number is larger" : "Second number is larger or they are equal";
        System.out.println("Result: " + result);

        scanner.close();
    }
}
