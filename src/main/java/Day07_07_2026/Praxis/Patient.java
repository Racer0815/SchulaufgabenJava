package Day07_07_2026.Praxis;

public class Patient {
    private String kvNummer;
    private String name;
    private String vorname;

    public Patient(){}
    public Patient(String kvNummer, String name, String vorname)
    {
        this.kvNummer = kvNummer;
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public String getKvNummer() {
        return kvNummer;
    }

    public String getVorname() {
        return vorname;
    }

}
