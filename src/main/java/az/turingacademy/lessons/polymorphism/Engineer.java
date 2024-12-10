package az.turingacademy.lessons.polymorphism;

import java.util.Objects;

public class Engineer extends Human {
    private int experienceYear;

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public Engineer (String name, int age, double salary, int experienceYear) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Engineer engineer = (Engineer) o;
        return experienceYear == engineer.experienceYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experienceYear);
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "experienceYear=" + experienceYear +
                '}';
    }
}
