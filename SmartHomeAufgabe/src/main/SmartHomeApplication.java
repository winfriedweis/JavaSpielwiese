package main;

import devices.SmartDevice;
import factory.SmartHomeFactory;
import factory.VillaFactory;

import java.util.List;

public class SmartHomeApplication {
    static void main() {
        System.out.println("=== Villa erstellen ===");
        SmartHomeFactory villa = new VillaFactory();
        List<SmartDevice> villaDevices = villa.erstelleStandardKit();

        for (SmartDevice device : villaDevices) {
            System.out.println("-> " + device.getDeviceType() + " " + device);
        }
    }
}
