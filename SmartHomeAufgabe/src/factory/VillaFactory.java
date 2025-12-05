package factory;

import devices.*;

import java.util.ArrayList;
import java.util.List;


public class VillaFactory extends SmartHomeFactory {

    @Override
    public List<SmartDevice> erstelleStandardKit() {
        List<SmartDevice> list = new ArrayList<>();
        list.add(new Alarmsystem("Alarmsystem Türschlösser"));
        list.add(new Sicherheitskamera("Kamera Flure"));
        list.add(new Lichtsystem("Lichtsystem für alle Zimmer"));
        list.add(new Heizung("Heizung alle Räume"));
        return list;
    }
}
