package az.turingacademy.quizzess;

public class Dog {

    private String dogsName;
    private int dogsAge;
    private String color;

    public Dog (String dogsName, int dogsAge, String color) {
        this.dogsAge=5;
        this.color="Black";
        this.dogsName="Zeus";
    }

    public int getDogsAge() {
        return dogsAge;
    }

    public String getColor() {
        return color;
    }

    public String getDogsName() {
        return dogsName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDogsAge(int dogsAge) {
        this.dogsAge = dogsAge;
    }

    public void setDogsName(String dogsName) {
        this.dogsName = dogsName;
    }

}
