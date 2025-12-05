package devices;

public class Heizung extends SmartDevice {
    public Heizung(String deviceName) {
        super(deviceName);
    }

    @Override
    public String getDeviceType() {
        return "Heizung";
    }
}
