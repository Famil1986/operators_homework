package az.turingacademy;

public class StringApp {
    public static void main(String [] args) {
        String name1 = "Turing";
        String name2 = "TURING";
        int number1 = 10;
        int number2 = 10;
        String name3 = new String("Turing");
        String name4 = new String("Turing");
        System.out.println(number2 == number1);
        System.out.println(name1.equalsIgnoreCase(name2));
        StringBuilder stringBuilder = new StringBuilder("Turing");
        StringBuffer stringBuffer = new StringBuffer("Turing");
      //  System.out.println(stringBuffer==stringBuilder);
        int a = 5;
        short b = 5;
        System.out.print(a==b);
    }

}
