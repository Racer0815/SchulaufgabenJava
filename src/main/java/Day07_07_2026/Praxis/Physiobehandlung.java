package Day07_07_2026.Praxis;

public class Physiobehandlung extends Behandlung {

    public  Physiobehandlung() {}
    public  Physiobehandlung(String kvNummer, String beschreibung, double kostensatz) {
        super(kvNummer, beschreibung, kostensatz);
    }

    @Override
    public double getKosten() {
        return super.getKosten() * 1.5;
    }
}
