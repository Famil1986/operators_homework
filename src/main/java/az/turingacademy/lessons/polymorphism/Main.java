package az.turingacademy.lessons.polymorphism;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human ("Vusal", 22, 2669.0);
        Teacher human2 = new Teacher("Vusal", 22, 2669.0, "IT");
        Engineer human3 = new Engineer("Fakhri", 26, 500.0, 3);

        System.out.println(human1 instanceof Teacher );
        Teacher teacher = (Teacher) human2;
        teacher.setSubject("Math");
        System.out.println(teacher.getSubject());

    }
}
