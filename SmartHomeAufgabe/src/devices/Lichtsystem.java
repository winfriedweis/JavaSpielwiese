package devices;

public class Lichtsystem extends SmartDevice {
    public Lichtsystem(String deviceName) {
        super(deviceName);
    }

    @Override
    public String getDeviceType() {
        return "Lichtsystem";
    }
}
