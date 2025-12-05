package devices;

public abstract class SmartDevice {
    protected String deviceName;
    protected boolean isActive;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isActive = false;
    }

    public abstract String getDeviceType();

    public String getStatus() {
        return isActive ? "AKTIV" : "INAKTIV";
    }

    public void turnOn() {
        isActive = true;
    }

    public void turnOff() {
        isActive = false;
    }

    @Override
    public String toString() {
        return getDeviceType() + " [" + deviceName + "] - Status: " + getStatus();
    }
}
