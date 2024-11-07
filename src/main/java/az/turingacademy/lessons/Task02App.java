package az.turingacademy.lessons;

import java.util.Scanner;

public class Task02App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if (month<=0 || month>12) {
            System.out.println("False");
        }else {
            if (month >= 3 && month < 6) {
                System.out.println("Spring");
            }else if (month>=6 && month<9) {
                System.out.println("Summer");
            } else if (month>=9 && month<12) {
                System.out.println("Autumn");
            }else {
                System.out.println("Winter");
            }
        }

        if (month==1) {
            System.out.println("Yanvar");
        } else if (month==2) {
            System.out.println("Fevral");
        } else if (month==3) {
            System.out.println("Mart");
        } else if (month==4) {
            System.out.println("Aprel");
        } else if (month==5) {
            System.out.println("May");
        } else if (month==6) {
            System.out.println("Iyun");
        } else if (month==7) {
            System.out.println("Iyul");
        } else if (month==8) {
            System.out.println("Avgust");
        } else if (month==9) {
            System.out.println("Sentyabr");
        } else if (month==10) {
            System.out.println("Oktyabr");
        } else if (month==11) {
            System.out.println("Noyabr");
        } else if (month==12) {
            System.out.println("Dekabr");
        }
    }
}
