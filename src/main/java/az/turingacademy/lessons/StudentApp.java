package az.turingacademy.lessons;

public class StudentApp {
    public static void main(String[] args) {

        int a = 5;   // local variable
        String b = new String("Hello");

        Student student = new Student("Ali", "Aliyev", 35);

        System.out.println(sum(a));

    }
    public static int sum(int a) {
        return a+5;
    }
}
