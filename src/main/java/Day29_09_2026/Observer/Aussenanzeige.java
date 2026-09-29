package Day29_09_2026.Observer;

public class Aussenanzeige implements Beobachter {

    @Override
    public void aktualisieren(double temperatur) {
        System.out.println(
                "Außenanzeige: " + temperatur + " °C"
        );
    }
}