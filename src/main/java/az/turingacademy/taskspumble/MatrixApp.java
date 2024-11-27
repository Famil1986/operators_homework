package az.turingacademy.taskspumble;

import java.util.Scanner;

public class MatrixApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert a rows of Matrix: ");
        int n = scan.nextInt();
        System.out.println("Insert a columns of Matrix: ");
        int m = scan.nextInt();

        if (n < 1 || n > 100 || m < 1 || m > 100) {
            System.out.println("n and m must be between 1 and 100.");
            return;
        }

        int result = 1;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(result+"");
                result++;
            }
            System.out.println();
        }
    }
}
