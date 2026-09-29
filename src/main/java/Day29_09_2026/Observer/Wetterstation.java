package Day29_09_2026.Observer;

import java.util.ArrayList;
import java.util.List;

public class Wetterstation {

    private double temperatur;

    private List<Beobachter> beobachter;

    public Wetterstation() {
        beobachter = new ArrayList<>();
    }

    // Beobachter registrieren
    public void registrieren(Beobachter beobachter) {
        if (!this.beobachter.contains(beobachter)) {
            this.beobachter.add(beobachter);
        }
    }

    // Beobachter entfernen
    public void entfernen(Beobachter beobachter) {
        this.beobachter.remove(beobachter);
    }

    // Temperatur ändern
    public void setTemperatur(double temperatur) {
        this.temperatur = temperatur;

        System.out.println(
                "\nWetterstation: Neue Temperatur = "
                        + temperatur + " °C"
        );

        benachrichtigeBeobachter();
    }

    // Alle Beobachter informieren
    private void benachrichtigeBeobachter() {
        for (Beobachter beobachter : beobachter) {
            beobachter.aktualisieren(temperatur);
        }
    }

    public double getTemperatur() {
        return temperatur;
    }
}