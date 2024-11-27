package az.turingacademy.taskspumble;

import java.util.Scanner;

public class BiggestNeighbourApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Set the count of numbers: ");
        int n = sc.nextInt();

        int[] neighbors = new int[n];

        for (int i = 0; i < n; i++ ) {
            System.out.println("Insert the numbers in array: ");
            neighbors[i] = sc.nextInt();
        }

        int count = 0;

        for ( int i = 1; i < n-1; i++) {
            if (neighbors[i] > neighbors[i-1] && neighbors[i] > neighbors[i+1]) {
                count++;
            }
        }

        System.out.println("Count of numbers bigger than neighbors are: " + count);

    }
}
