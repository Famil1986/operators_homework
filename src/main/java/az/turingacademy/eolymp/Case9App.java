package az.turingacademy.eolymp;

import java.util.Scanner;

public class Case9App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dordreqemli ededi qeyd edin: ");
        int reqem = scanner.nextInt();

        int ilkReqem = reqem/1000;
        int sonReqem = reqem%10;

        int cem = ilkReqem + sonReqem;

        System.out.println("Cem edir: " + cem);

        scanner.close();
    }
}
