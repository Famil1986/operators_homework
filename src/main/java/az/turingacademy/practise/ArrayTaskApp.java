package az.turingacademy.practise;

public class ArrayTaskApp {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 36, 7, 8, 998, 3, 6, 878};
        int max = numbers[0];
        for (int i = numbers[0]; i < numbers.length; i++) {
            if (numbers[i] > max){
                max=numbers[i];
            }
        }
        System.out.println(max);

    }
}
