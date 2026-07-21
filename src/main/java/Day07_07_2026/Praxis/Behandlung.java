package Day07_07_2026.Praxis;

public class Behandlung {
    protected String kvNummer;
    protected String beschreibung;
    protected double kostensatz;

    public double getKosten() {
        return kostensatz;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public String getKvNummer() {
        return kvNummer;
    }

    public Behandlung(){}
    public Behandlung(String kvNummer, String beschreibung, double kostensatz)
    {
        this.kvNummer = kvNummer;
        this.beschreibung = beschreibung;
        this.kostensatz = kostensatz;
    }

}
