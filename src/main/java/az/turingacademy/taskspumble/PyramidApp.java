package az.turingacademy.taskspumble;

import java.util.Scanner;

public class PyramidApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give the size of pyramid: ");
        int pyramid = scan.nextInt();

        for (int i=1; i <= pyramid; i++) {
            for ( int j = i; j <= pyramid; j++) {
                    System.out.print("*");
                }
            for (int k = i; k <= pyramid; k++  ) {
                System.out.print(" ");
            }   System.out.println();

            }

        System.out.println("Reverse pyramid");

        for (int i=0; i <= pyramid - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k > i; k++  ) {
                System.out.print(" ");
            }   System.out.println();

        }
        }
    }

