package tag3_converter;

import java.util.ArrayList;
import java.util.List;

public class Mitarbeiter {

    private String name;
    private int nummer;

    public static List <Mitarbeiter> mitarbeiterListe = new ArrayList<>();

    public static StringConverter<Mitarbeiter> converter = new StringConverter<Mitarbeiter>() {
        @Override
        String toString(Mitarbeiter obj) {
            return String.valueOf(obj.nummer);
        }

        @Override
        Mitarbeiter fromString(String str) {
            try {
                int nummer = Integer.parseInt(str);
                for ( Mitarbeiter m : mitarbeiterListe ) {
                    if ( m.nummer == nummer ) {
                        return m;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe!");
            }
            return null;
        }
    };

    public Mitarbeiter(String name, int nummer){
        this.name = name;
        this.nummer = nummer;
        mitarbeiterListe.add(this);
    }

    public String getName() {
        return name;
    }
}
