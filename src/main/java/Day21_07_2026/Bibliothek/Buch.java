package Day21_07_2026.Bibliothek;

public class Buch extends Medium{
    private int seitenzahl;

    public Buch(int bibNr, String titel, String zustand, int seitenzahl) {
        super(bibNr, titel, zustand);
        this.seitenzahl = seitenzahl;
    }
}
