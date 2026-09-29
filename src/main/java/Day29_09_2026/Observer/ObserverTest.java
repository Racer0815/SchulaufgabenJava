package Day29_09_2026.Observer;

import java.util.Scanner;

public class ObserverTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Wetterstation erzeugen
        Wetterstation wetterstation = new Wetterstation();

        // Anzeigen erzeugen
        Aussenanzeige aussenanzeige = new Aussenanzeige();
        Besucheranzeige besucheranzeige = new Besucheranzeige();
        Hausmeisteranzeige hausmeisteranzeige =
                new Hausmeisteranzeige();

        // Anzeigen registrieren
        wetterstation.registrieren(aussenanzeige);
        wetterstation.registrieren(besucheranzeige);
        wetterstation.registrieren(hausmeisteranzeige);

        System.out.println("Wetterstation gestartet.");
        System.out.println("Gib eine Temperatur ein.");
        System.out.println("Mit 'q' wird das Programm beendet.");

        while (true) {

            System.out.print("\nTemperatur: ");

            String eingabe = scanner.nextLine();

            if (eingabe.equalsIgnoreCase("q")) {
                break;
            }

            try {

                double temperatur = Double.parseDouble(eingabe);

                wetterstation.setTemperatur(temperatur);

            } catch (NumberFormatException e) {

                System.out.println(
                        "Bitte eine gültige Zahl eingeben."
                );
            }
        }

        scanner.close();
    }
}