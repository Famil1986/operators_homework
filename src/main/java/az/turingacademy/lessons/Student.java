package az.turingacademy.lessons;

public class Student {
    public String name;  // instance variable
    public String surname;
    public int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student(String name) {
        this.name= name;
    }

    public Student(int age, String surname) {
        this.age = age;
        this.surname = surname;
    }
}
