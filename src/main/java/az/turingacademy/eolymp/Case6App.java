package az.turingacademy.eolymp;

import java.util.Scanner;

public class Case6App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucbucagin birinci terefinin uzunlugu: ");
        int a = scanner.nextInt();

        System.out.println("Ucbucagin ikinci terefinin uzunlugu: ");
        int b = scanner.nextInt();

        System.out.println("Ucbucagin ucuncu terefinin uzunlugu: ");
        int c = scanner.nextInt();

        if (a>b && a>c) {
            if (a*a== (b*b + c*c) ) {
                System.out.println("Cavab: Beli");
            }else {
                System.out.println("Cavab: Xeyr");
            }
        } else if (b>a && b>c) {
            if (b*b == (a*a) + (c*c)) {
                System.out.println("Cavab: Beli");
            }else {
                System.out.println("Cavab: Xeyr");
            }
        }else if (c>a && c>b) {
            if (c*c == (a*a) + (b*b)){
                System.out.println("Cavab: Beli");
            }else {
                System.out.println("Cavab: Xeyr");
            }
        }
        scanner.close();
    }
}
