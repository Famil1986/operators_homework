package az.turingacademy.taskspumble;

import java.util.Scanner;

public class Corona2020App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert digit a: ");
        int a = scan.nextInt();
        System.out.println("Insert digit b: ");
        int b = scan.nextInt();
        System.out.println("Insert digit c:");
        int c = scan.nextInt();

        int d = a + b - c;
        int e = a - b + c;
        int h = a + b + c;
        int g = a - b - c;
        int f = 2020;

        if (f==d){
            System.out.println(a +"+"+ b + "-" + c);
        } else if (f==e) {
            System.out.println(a + "-" + b + "+" + c);
        } else if (f==h) {
            System.out.println(a + "+" + b + "+" + c);
        } else if (f==g) {
            System.out.println(a + "-" + b + "-" + c);
        } else {
            System.out.println("CORONA");
        }


    }
}
