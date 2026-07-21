package Day21_07_2026.Bibliothek;

import java.util.Vector;

public class Bibliothek {
    private Vector<Medium> medienListe;
    private Vector<Leser> leserListe;

    public Bibliothek() {
        medienListe = new Vector<Medium>();
        leserListe = new Vector<Leser>();
    }

    public int ermittleVormerkungen(int bibNr) {
        int anzahl = 0;

        for (Leser leser : leserListe) {
            for (Medium medium : leser.getVormerkliste()) {
                if (medium.getBibNr() == bibNr) {
                    anzahl++;
                    break;
                }
            }
        }

        return anzahl;
    }
}
