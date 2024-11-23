package az.turingacademy.weeklytasks;

import java.util.Scanner;

public class SimpleProblemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert two digit number: ");
        int number = sc.nextInt();
        int firstNumber = number/10;
        int secondNumber = number%10;

        if (number > 9 && number < 100){
            System.out.println("First number " + firstNumber);
            System.out.println("Second number " + secondNumber);
            System.out.println(firstNumber + " " + secondNumber);
        } else {
            System.out.println("Wrong input. Please try again.");
        }
    }
}
