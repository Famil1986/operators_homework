package az.turingacademy.weeklytasks.smarthome;

public class Light extends Device {

    public Light(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(getStatus() + "Light is on");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(getStatus() + "Light is off");
    }
}
