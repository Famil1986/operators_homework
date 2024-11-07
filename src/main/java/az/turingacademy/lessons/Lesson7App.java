package az.turingacademy.lessons;

import java.util.Arrays;

public class Lesson7App {
    public static void main(String[] args) {
        //input
        String [] names = new String[5];
        names [0] = "Turing";
        names [1] = "Turing";
        names [2] = "Turing";
        names [3] = "Turing";
        names [4] = "Turing";

        String [] namesNew = new String [6];


        for (int i = 0; i < namesNew.length; i++) {
            if (i==5) {
                namesNew[i] = "Turing";
            } else {
                namesNew[i]=names[i];

                System.out.println(Arrays.toString(names));
                System.out.println(Arrays.toString(namesNew));  }
        }

    }
}
