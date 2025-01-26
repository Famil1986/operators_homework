package az.turingacademy.lessons.functionalJava;

import java.util.Comparator;

public abstract class CustomComparatorClass implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int nameCompare = o1.getName().compareTo(o2.getName());
        if (nameCompare == 0) {
            return o1.getAge() - o2.getAge();
        } return nameCompare;
    }
}
