package az.turingacademy.taskspumble.employeetask;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager ("Fakhri", 5000, 10),
                new Developer( "Vusal", 3000, "Python"),
                new Manager( "Samir", 4000, 8),
                new Developer("Ali", 2000, "Javascript")
        };

        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.printf("Bonus (10%%): $%.2f%n", employee.calculateBonus(10));
            System.out.printf("Bonus (10%% + $1000): $%.2f%n%n", employee.calculateBonus(10, 1000));
        }

    }
}
