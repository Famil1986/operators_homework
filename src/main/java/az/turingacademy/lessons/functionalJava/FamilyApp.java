package az.turingacademy.lessons.functionalJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FamilyApp {
    public static void main(String[] args) {
        Person person = new Person(123L, "Famo", 38);

        Person person1 = new Person(237L, "GGG", 34);
        Person person2 = new Person(238L, "JJJ", 23);
        Person person6 = new Person(238L, "JJJJ", 23);
        Person person3 = new Person(239L, "BBB", 56);
        Person person5 = new Person(2399L, "BBB", 56);
        Person person4 = new Person(232L, "DDD", 76);

        //   System.out.println(person.setName("Pilgrim").setAge(33));

        ArrayList<Person> family = new ArrayList<>();
        family.add(person2);
        family.add(person1);
        family.add(person);
        family.add(person3);
        family.add(person4);
        family.add(person5);
        family.add(person6);

        new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int nameCompare = o1.getName().compareTo(o2.getName());
                if (nameCompare == 0) {
                    return o1.getAge() - o2.getAge();
                }
                return nameCompare;
            }
        };
    }
}