package az.turingacademy.weeklytasks.smarthome;

public class Thermostat extends Device {

    private int temperature;

    public Thermostat(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(getStatus() + "Thermostat is on");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(getStatus() + " is off");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(getName() + " temperature is set to " + temperature + " C");
    }
}
