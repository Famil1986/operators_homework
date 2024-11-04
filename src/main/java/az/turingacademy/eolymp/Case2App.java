package az.turingacademy.eolymp;

import java.util.Scanner;

public class Case2App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilk reqemi daxil edin");
        int a = scanner.nextInt();

        System.out.println("Ikinci reqemi daxil edin");
        int b = scanner.nextInt();

        System.out.println("Ucuncu reqemi daxil edin");
        int c = scanner.nextInt();

        int median;

        if ((a>b && a<c) || (a>c && a<b)) {
            median = a;
        } else if ((b>a && b<c) || (b<a && b>c)) {
            median = b;
        } else {
            median = c;
        }
        System.out.println("Median:" + median);

        scanner.close();


    }
}
