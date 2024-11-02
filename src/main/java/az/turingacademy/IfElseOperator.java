package az.turingacademy;

import java.util.Scanner;

public class IfElseOperator {

    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bura reqem yazin: ");
        int value= scanner.nextInt();
        String result = "";

        //proses
        if(value%3==0) {
            result = "Eded 3-e tam bolunur";
        }else if(value%3==1){
            result="Eded 3-e tam bolunur ve qaliq 1-dir";
        }else{
            result="Eded 3-e bolunur ve qaliq 2-dir";
        }
        System.out.println(result);
    }
}
