package az.turingacademy.weeklytasks.smarthome;

public abstract class Device {

    public enum DeviceType { LIGHT, THERMOSTAT, CAMERA, DOORBELL}

    private static int deviceCounter = 0;
    private int id;
    private String name;
    private boolean status;

    public Device (String name) {
        this.name = name;
        this.id = deviceCounter++;
        this.status = false;
    }

    public abstract void turnOn();

    public abstract void turnOff ();

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
