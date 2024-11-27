package az.turingacademy.taskspumble;

import java.util.Scanner;

public class MaxSalaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert salary values:");
        String input = scanner.nextLine();

        String[] salaries = input.split(" ");

        double maxSalary = 0;

        for (String salary : salaries) {
            double salaryValue = Double.parseDouble(salary);
            if (salaryValue > maxSalary) {
                maxSalary = salaryValue;
            }
        }

        System.out.printf("Max salary would be: " + "%.2f%n", maxSalary);

        scanner.close();
    }
}




