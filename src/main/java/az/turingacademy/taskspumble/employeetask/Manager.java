package az.turingacademy.taskspumble.employeetask;

public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team size: " + teamSize);
    }

    public double calculateBonus (double percentage, double fixedAmount) {
        return calculateBonus(percentage) + fixedAmount;
    }
}
