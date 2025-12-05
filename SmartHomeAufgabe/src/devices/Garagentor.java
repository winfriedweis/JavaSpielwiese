package devices;

public class Garagentor extends SmartDevice {
    public Garagentor(String deviceName) {
        super(deviceName);
    }

    @Override
    public String getDeviceType() {
        return "Garagentor";
    }
}
