package az.turingacademy;

import java.util.Scanner;

public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bura reqem yazin: ");
        int value= scanner.nextInt();
        String result = "";

        switch (value%3) {
            case 0:
                result = "Eded 3-e tam bolunur";
                break;
            case 1:
                result = "Eded 3-e tam bolunur ve __ qaliq birdir";
                break;
            case 2:
                result = "Eded 3-tam bolunur ve qaliq 2-dir";
                break;
            default:
                result = "Eded 3- tam bolunur ve qaliq "+ value%3 + "-dir";
    }


    System.out.println(result);

    }
}
