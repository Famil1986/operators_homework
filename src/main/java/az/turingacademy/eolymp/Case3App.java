package az.turingacademy.eolymp;

import java.util.Scanner;

public class Case3App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Meblegi daxil edin: ");

        int mebleg = scanner.nextInt();

        int bank = 0;
        int hediyye = 1;
        int yash = 1;

        while (bank < mebleg) {
            bank += hediyye;
            hediyye = hediyye*2 + yash;
            yash++;
        }
        System.out.println((yash - 1) + " yashinda Buratinonun bank hesabinda en azi: " + mebleg + " manat pulu var" );

        scanner.close();

    }
}
