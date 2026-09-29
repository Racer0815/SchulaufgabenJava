package Day29_09_2026.Benutzerverwaltung;

public class SingletonTest {

    public static void main(String[] args) {

        BenutzerVerwaltung verwaltung1 =
                BenutzerVerwaltung.getInstanz();

        BenutzerVerwaltung verwaltung2 =
                BenutzerVerwaltung.getInstanz();

        BenutzerVerwaltung verwaltung3 =
                BenutzerVerwaltung.getInstanz();

        // Benutzer über verschiedene Variablen hinzufügen
        verwaltung1.benutzerHinzufuegen("Alice");
        verwaltung2.benutzerHinzufuegen("Bob");
        verwaltung3.benutzerHinzufuegen("Charlie");

        // Alle drei Variablen zeigen auf dasselbe Objekt
        System.out.println(
                "verwaltung1 == verwaltung2: "
                        + (verwaltung1 == verwaltung2)
        );

        System.out.println(
                "verwaltung2 == verwaltung3: "
                        + (verwaltung2 == verwaltung3)
        );

        System.out.println();

        // Benutzer nur über eine Instanz ausgeben
        verwaltung1.zeigeBenutzer();
    }
}