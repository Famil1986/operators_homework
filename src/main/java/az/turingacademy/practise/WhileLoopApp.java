package az.turingacademy.practise;

public class WhileLoopApp {
    public static void main(String[] args) {
        //input
        int i = 0;
        //proses
        while (true) {
            System.out.println(i);
            if (i == 5) {
                break;
            } else if (i == 3) {
                i++;
                continue;
            }
            i++;
        }
            //output
            System.out.println(i);
            System.out.println((++i));

    }
}
