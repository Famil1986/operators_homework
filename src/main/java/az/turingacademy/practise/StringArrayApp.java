package az.turingacademy.practise;

import java.util.Arrays;

public class StringArrayApp {
    public static void main(String[] args) {
        String [] names = new String[5];
        names[0] = "Turing";
        names[1] = "Turing";
        names[2] = "Turing";
        names[3] = "Turing";
        names[4] = "Turing";
        System.out.println(Arrays.toString(names));

        names[4] = "Famil";
        System.out.println(Arrays.toString(names));

        int[][] numbers = new int[3][4];
        numbers[0][0] = 444;

        System.out.println(numbers[0][0]);

        int[] num = {1, 2, 3, 4, 5, 6};
        int cem = num[2] + num[3];
        System.out.println(cem);

    }
}
