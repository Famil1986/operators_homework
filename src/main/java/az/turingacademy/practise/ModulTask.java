package az.turingacademy.practise;

public class ModulTask {
    public static void main(String[] args) {
        int counter = 10;
        while (counter > 0) {
            if (counter > 3 && counter < 9) {
                counter --;
                continue;
            } else if (counter < 2) {
                break;
            }else {
                System.out.print(counter + " ");
                counter --;
            }
        }
    }
}
