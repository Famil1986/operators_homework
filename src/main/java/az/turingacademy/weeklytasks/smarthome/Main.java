package az.turingacademy.weeklytasks.smarthome;

public class Main {
    public static void main(String[] args) {

        SmartHome smartHome = new SmartHome();
        Light light = new Light("Home light");
        Camera camera = new Camera("Security camera");
        Doorbell doorbell = new Doorbell("Main doorbell");
        Thermostat thermostat = new Thermostat("Home Thermostat");

        smartHome.addDevice(light);
        smartHome.addDevice(camera);
        smartHome.addDevice(doorbell);
        smartHome.addDevice(thermostat);

        light.turnOn();
        camera.turnOn();
        camera.startRecording();
        doorbell.turnOn();
        doorbell.ring();
        thermostat.turnOn();
        thermostat.setTemperature(35);

        smartHome.showAllDevices();

        light.turnOff();
        camera.stopRecording();
        camera.turnOff();
        doorbell.turnOff();
        thermostat.turnOff();

    }
}
