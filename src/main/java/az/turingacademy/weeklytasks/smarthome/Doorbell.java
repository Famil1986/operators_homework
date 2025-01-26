package az.turingacademy.weeklytasks.smarthome;

public class Doorbell extends Device {

    public Doorbell(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(getName() + " is on");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(getName() + " is off");
    }

    public void ring() {
        if (getStatus()) {
            System.out.println(getName() + " is ringing");
        } else {
            System.out.println(getName() + " cannot ring. Doorbell is off");
        }
    }
}
