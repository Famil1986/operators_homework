package az.turingacademy.eolymp;

import java.util.Scanner;

public class Case8App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ucreqemli ededi qeyd edin: ");
        int number = scanner.nextInt();

        int yuzlukler = number / 100;
        int onluqlar = (number / 10) % 10;
        int teklikler = number % 10;

        int sum = yuzlukler + onluqlar + teklikler;

        double kokEded = Math.sqrt(sum);
        System.out.printf("%.3f", kokEded);

        scanner.close();

    }
}
