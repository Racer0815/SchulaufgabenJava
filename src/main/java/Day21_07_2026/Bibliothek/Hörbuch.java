package Day21_07_2026.Bibliothek;

public class Hörbuch extends Medium {
    private int dauer;

    public Hörbuch(int bibNr, String titel, String zustand, int dauer) {
        super(bibNr, titel, zustand);
        this.dauer = dauer;
    }
}
