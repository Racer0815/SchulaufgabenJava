package Day29_09_2026.Observer;
public class Besucheranzeige implements Beobachter {

    @Override
    public void aktualisieren(double temperatur) {
        System.out.println(
                "Besucheranzeige: Aktuelle Temperatur "
                        + temperatur + " °C"
        );
    }
}