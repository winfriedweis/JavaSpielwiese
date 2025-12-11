package tag3_converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        new Mitarbeiter("Anna Müller", 101);
        new Mitarbeiter("Bob Schmidt", 102);
        new Mitarbeiter("Carla Weber", 103);
        new Mitarbeiter("David Fischer", 104);

        System.out.println("Mitarbeiter (Nummern):");
        for (Mitarbeiter m : Mitarbeiter.mitarbeiterListe) {
            System.out.println("  " + Mitarbeiter.converter.toString(m));
        }

        System.out.println("\nGeben Sie eine Mitarbeiternummer ein:");
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();

        Mitarbeiter gefunden = Mitarbeiter.converter.fromString(eingabe);
        if (gefunden != null) {
            System.out.println("Name: " + gefunden.getName());
        } else {
            System.out.println("Mitarbeiter nicht gefunden!");
        }

        scanner.close();
    }
}
