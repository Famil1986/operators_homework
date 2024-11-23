package az.turingacademy.practise;

import java.util.Scanner;

public class printTriangleApp {
    public static void printTriangle(int size) {
        if (size <= 0) {
            System.out.println("Size must be a positive integer.");
            return;
        }

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the size of triangle: ");
        int size = sc.nextInt();
        printTriangle(size);
    }
}
