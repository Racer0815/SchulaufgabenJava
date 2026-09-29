package Day29_09_2026.Kaffeevollautomat;

public class Kaffeevollautomat extends Geraet {

    private int milch = 0;
    private int kaffee = 0;
    private int tassen = 0;

    public Kaffeevollautomat(String id, Nachrichtenschlange schlange) {
        super(id, schlange);
    }

    public void fuelle(int kaffee, int milch) {
        if (kaffee >= 0) {
            this.kaffee += kaffee;
        }
        if (milch >= 0) {
            this.milch += milch;
        }
    }

    public void erzeugeTasseKaffee(boolean mitMilch) {
        if (defekt) {
            return;
        }

        if (Math.random() < 0.02) {
            defekt = true;
            schlange.neueNachricht(new Nachricht(holeId(), "Mahlwerk defekt"));
            return;
        }

        boolean kaffeeFehlt = kaffee < 25;
        boolean milchFehlt = mitMilch && milch < 10;

        if (kaffeeFehlt) {
            schlange.neueNachricht(new Nachricht(holeId(), "Kaffee fehlt"));
        }
        if (milchFehlt) {
            schlange.neueNachricht(new Nachricht(holeId(), "Milch fehlt"));
        }
        if (kaffeeFehlt || milchFehlt) {
            return;
        }

        kaffee -= 25;
        if (mitMilch) {
            milch -= 10;
            System.out.println("Tasse Kaffee mit Milch ausgegeben.");
        } else {
            System.out.println("Tasse Kaffee ohne Milch ausgegeben.");
        }

        tassen++;
        if (tassen % 10 == 0) {
            schlange.neueNachricht(
                    new Nachricht(holeId(), tassen + " Tassen ausgegeben"));
        }
    }
}
