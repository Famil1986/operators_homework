package az.turingacademy.lessons;

import java.util.Scanner;

public class Lesson05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir reqem daxil edin: ");
        int num = scanner.nextInt();


      /*  if (num % 2 ==1){
            System.out.println("Tekdir");
        }else {
            System.out.println("Cutdur");
        } */
        String result = num > 0 ? "Musbetdir" : (num == 0 ? "Sifirdir" : "Menfidir");
        System.out.println(result);

       /* if (num < 0) {
            System.out.println("Menfidir");
        } else if (num > 0) {
            System.out.println("Musbetdir");
        } else {
            System.out.println("Sifirdir");
        } */


    }
}
