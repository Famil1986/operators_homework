package az.turingacademy.weeklytasks.smarthome;

import java.util.ArrayList;
import java.util.List;

public class SmartHome implements Managable {

    private List <Device> devices;

    public SmartHome () {
        devices = new ArrayList<>();
    }


    @Override
    public void addDevice(Device device) {
        devices.add(device);
        System.out.println(device.getName() + " Added to the Smarthome");
    }

    @Override
    public void removeDevice(Device device) {
        devices.remove(device);
        System.out.println(device.getName() + " Removed from Smarthome");
    }

    public void showAllDevices () {
        System.out.println("Devices in the Smart Home:");
        for (Device device:devices) {
            System.out.println("- " + device.getName() + "Status: " + (device.getStatus() ? "ON" : "OFF" ));
        }
    }
}
