package az.turingacademy.weeklytasks.smarthome;

public class Camera extends Device {

    private boolean recording;

    public Camera(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(getName() + " is recording");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(getName() + " is OFF. Cannot start recording");
    }

    public void startRecording () {
        if (getStatus()) {
            recording = true;
            System.out.println(getName() + " started recording");
        } else {
            System.out.println(getName() + " is OFF. Cannot start recording");
        }
    }

    public void stopRecording () {
        if (recording) {
            recording = false;
            System.out.println(getName() + " stopped recording");
        } else {
            System.out.println(getName() + " is not recording");
        }
    }
}
