package main;

import devices.SmartDevice;
import factory.LoftFactory;
import factory.SmartHomeFactory;
import factory.VillaFactory;

import java.util.List;

public class SmartHomeApplication {
    public static void main(String[] args) {
        System.out.println("=== Villa erstellen ===");
        SmartHomeFactory villa = new VillaFactory();
        List<SmartDevice> villaDevices = villa.erstelleStandardKit();

        for (SmartDevice device : villaDevices) {
            System.out.println("-> " + device.getDeviceType() + " " + device);
        }
        System.out.println("\n=== Loft erstellen ===");
        SmartHomeFactory loft = new LoftFactory();
        List<SmartDevice> loftDevices = loft.erstelleStandardKit();

        for (SmartDevice device : loftDevices) {
            System.out.println("-> " + device.getDeviceType() + " " + device);
        }


    }
}
