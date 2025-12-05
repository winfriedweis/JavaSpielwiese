package factory;

import devices.SmartDevice;

import java.util.List;

public abstract class SmartHomeFactory {

    public abstract List<SmartDevice> erstelleStandardKit();
}
