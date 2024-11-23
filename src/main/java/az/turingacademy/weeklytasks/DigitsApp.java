package az.turingacademy.weeklytasks;

import java.util.Scanner;

public class DigitsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int digitsCount = String.valueOf(number).length();

        System.out.println(digitsCount);

    }
}
