package devices;

public class Alarmsystem extends SmartDevice {

    private int alarmlevel = 1;

    public Alarmsystem(String deviceName) {
        super(deviceName);
    }

    @Override
    public String getDeviceType() {
        return "Alarmsystem";
    }

    public void setAlarmlevel(int level) {
        this.alarmlevel = level;
    }

    public int getAlarmlevel() {
        return alarmlevel;
    }
}
