package az.turingacademy.eolymp;

import java.util.Scanner;

public class Case4App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilk ededi daxil edin: ");
        int a = scanner.nextInt();

        System.out.println("Ikinci ededi daxil edin: ");
        int b = scanner.nextInt();

        int result = (a*a) + (b*b);

        System.out.println("Netice: " + result);

        scanner.close();
    }

}
