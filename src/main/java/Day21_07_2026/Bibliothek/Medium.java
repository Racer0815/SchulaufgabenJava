package Day21_07_2026.Bibliothek;

public abstract class Medium {

    private int bibNr;
    private String titel;
    private String zustand;

    public Medium(int bibNr, String titel, String zustand) {
        this.bibNr = bibNr;
        this.titel = titel;
        this.zustand = zustand;
    }

    public int getBibNr() {
        return bibNr;
    }
}
