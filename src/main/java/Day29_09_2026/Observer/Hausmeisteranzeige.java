package Day29_09_2026.Observer;

public class Hausmeisteranzeige implements Beobachter {

    @Override
    public void aktualisieren(double temperatur) {
        System.out.println(
                "Hausmeisteranzeige: Temperatur "
                        + temperatur + " °C"
        );
    }
}