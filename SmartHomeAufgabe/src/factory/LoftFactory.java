package factory;

import devices.*;

import java.util.ArrayList;
import java.util.List;

public class LoftFactory extends SmartHomeFactory {
    @Override
    public List<SmartDevice> erstelleStandardKit() {
        List<SmartDevice> list = new ArrayList<>();
        list.add(new Alarmsystem("Alarmsystem Türschlösser"));
        list.add(new Heizung("Heizung alle Räume"));
        list.add(new Poolsteuerung("Pool auf Terrasse"));
        list.add(new Klimaanlage("Klimasystem alle Zimmer"));
        list.add(new Lichtsystem("Ambientebeleuchtung"));
        return list;
    }
}
