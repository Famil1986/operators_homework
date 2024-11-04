package az.turingacademy.eolymp;

import java.util.Scanner;

public class Case1App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ikireqemli eded daxil edin: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) {
            int onluqlar = number/10;
            int teklikler = number%10;

            System.out.println(onluqlar + " "+ teklikler);
        }
        scanner.close();
    }
}
