package az.turingacademy.taskspumble;

import java.util.Scanner;

public class BiggestElementApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements should contain the array?: ");
        int n = scan.nextInt();
        int[] elements = new int[n];

        System.out.println("Insert the elements to the array: ");
        for (int i = 0; i <n; i++) {
            elements[i] = scan.nextInt();
        }

        int biggestElement = elements[0];
        int biggestIndex = 0;

        for (int i = 1; i < n; i++ ) {
            if (biggestElement < elements[i]) {
                biggestElement = elements[i];
                biggestIndex = i;
            }
        }
        System.out.println("The biggest element is: " + biggestElement);
        System.out.println("The biggest index is: " + biggestIndex);
    }
}
