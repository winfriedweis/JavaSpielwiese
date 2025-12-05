package devices;

public class Sicherheitskamera extends SmartDevice {

    public Sicherheitskamera(String deviceName) {
        super(deviceName);
    }

    @Override
    public String getDeviceType() {
        return "Sicherheitskamera";
    }
}
