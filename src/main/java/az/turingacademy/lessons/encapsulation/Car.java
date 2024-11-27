package az.turingacademy.lessons.encapsulation;

public class Car {
    private String model;
    public String color;
    private int speed;

    public Car(String nov, String color, int speed) {
        this.color = color;
        this.model = "bmw";
        setSpeed(speed);
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int speed) {
        if(speed>30) {
            this.speed = speed;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
