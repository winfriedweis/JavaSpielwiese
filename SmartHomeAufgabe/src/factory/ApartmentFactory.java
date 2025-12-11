package factory;

import devices.*;

import java.util.ArrayList;
import java.util.List;

public class ApartmentFactory extends SmartHomeFactory {
    @Override
    public List<SmartDevice> erstelleStandardKit() {
        List<SmartDevice> list = new ArrayList<>();
        list.add(new Sicherheitskamera("Kamera Flure"));
        list.add(new Heizung("Heizung alle Räume"));
        list.add(new Klimaanlage("Klimaanlage_Wohnzimmer"));
        list.add(new Garagentor("Garage Seite Links"));

        return list;
    }
}
