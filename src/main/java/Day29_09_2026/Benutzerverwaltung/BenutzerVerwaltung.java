package Day29_09_2026.Benutzerverwaltung;

import java.util.Vector;

public class BenutzerVerwaltung {

    private static BenutzerVerwaltung instanz;
    private Vector<String> benutzer;

    // Privater Konstruktor
    private BenutzerVerwaltung() {
        benutzer = new Vector<>();
    }

    // Liefert die einzige Instanz zurück
    public static BenutzerVerwaltung getInstanz() {
        if (instanz == null) {
            instanz = new BenutzerVerwaltung();
        }

        return instanz;
    }

    // Benutzer hinzufügen
    public void benutzerHinzufuegen(String name) {
        benutzer.add(name);
    }

    // Alle Benutzer anzeigen
    public void zeigeBenutzer() {
        System.out.println("Angemeldete Benutzer:");

        for (String name : benutzer) {
            System.out.println("- " + name);
        }
    }
}
