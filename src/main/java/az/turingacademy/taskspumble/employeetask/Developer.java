package az.turingacademy.taskspumble.employeetask;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, int salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming language: " + programmingLanguage);
    }

    public double calculateBonus (double percentage, double fixedAmount) {
        return calculateBonus(percentage) + fixedAmount;
    }
}
