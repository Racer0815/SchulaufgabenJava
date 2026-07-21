package Day21_07_2026.Bibliothek;

import java.util.Vector;

public class Leser {
    private int leserNummer;
    private String name;
    private String vorname;

    public Leser(int leserNummer, String name, String vorname) {
        this.leserNummer = leserNummer;
        this.name = name;
        this.vorname = vorname;
    }

    public Vector<Medium> getAusleihliste()
    {
        return null;
    }

    public Vector<Medium> getVormerkliste()
    {
        return null;
    }

    public Boolean hatAusgeliehen(int bibNr)
    {
        return getAusleihliste().contains(bibNr);
    }
}
