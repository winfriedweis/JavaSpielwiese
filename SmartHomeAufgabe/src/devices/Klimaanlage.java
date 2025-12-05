package devices;

public class Klimaanlage extends SmartDevice{
    public Klimaanlage(String deviceName) {
        super(deviceName);
    }

    @Override
    public String getDeviceType() {
        return "Klimaanlage";
    }
}
