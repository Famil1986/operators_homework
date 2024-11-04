package az.turingacademy.eolymp;

import java.util.Scanner;

public class Case7App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ayin sira nomresini qeyd edin: ");

        int ay = scanner.nextInt();

        if (ay >= 1 && ay <= 12){
            if (ay > 2 && ay < 6) {
                System.out.println("Cavab: Yaz feslidir");
            } else if (ay > 5 && ay < 9) {
                System.out.println("Cavab: Yay feslidir");
            } else if (ay > 8 && ay < 12) {
                System.out.println("Cavab: Payiz feslidir");
            } else {
                System.out.println("Cavab: Qish feslidir");
            }
            } else {
                System.out.println("Say; duzgun qeyd etmemisiniz");
        }scanner.close();

    }
}
