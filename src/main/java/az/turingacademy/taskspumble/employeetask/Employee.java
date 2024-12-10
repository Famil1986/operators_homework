package az.turingacademy.taskspumble.employeetask;

public class Employee {
    public String name;
    public int salary;

    public Employee (String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println(STR."Employee name: \{name} and salary: \{salary}");
    }

    public double calculateBonus (double percentage) {
        return salary*( percentage / 100);
    }

    public double calculateBonus (double percentage, double fixedAmount) {
        return calculateBonus(percentage) + fixedAmount;
    }
}
