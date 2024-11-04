package az.turingacademy.eolymp;

import java.util.Scanner;

public class Case5App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 reqemli sayi daxil edin: ");
        int reqem = scanner.nextInt();

        int ilkReqem = reqem/100;
        int sonReqem = reqem%10;

        if (ilkReqem>sonReqem) {
            System.out.println("Ilk reqem boyukdur");
        } else if (sonReqem>ilkReqem){
            System.out.println("Son reqem boyukdur");
        } else {
            System.out.println("-");

            scanner.close();
        }

    }
}
