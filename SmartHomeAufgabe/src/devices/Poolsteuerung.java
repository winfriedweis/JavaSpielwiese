package devices;

public class Poolsteuerung extends SmartDevice{
    public Poolsteuerung(String deviceName) {
        super(deviceName);
    }

    @Override
    public String getDeviceType() {
        return "Poolsteuerung";
    }
}
