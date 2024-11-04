package az.turingacademy.eolymp;

import java.util.Scanner;

public class Case10App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ayin nomresini qeyd edin: ");

        int ay = scanner.nextInt();

        if (ay<=12 && ay >= 1) {
            if (ay >= 1 && ay <= 3) {
                System.out.println("First");
            } else if (ay >= 4 && ay <= 6) {
                System.out.println("Second");
            } else if (ay >= 7 && ay <= 9) {
                System.out.println("Third");
            } else if (ay >= 10 && ay <= 12){
                System.out.println("Fourth");
            } else {
                System.out.println("Reqem duzgun yazilmayib");
            }

        } scanner.close();
    }
}
