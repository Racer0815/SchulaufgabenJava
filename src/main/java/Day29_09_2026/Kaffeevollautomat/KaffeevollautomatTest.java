package Day29_09_2026.Kaffeevollautomat;

public class KaffeevollautomatTest {

    public static void main(String[] args) {
        Nachrichtenschlange schlange = new Nachrichtenschlange();
        Kaffeevollautomat automat = new Kaffeevollautomat("Maximus R306", schlange);

        automat.fuelle(700, 70);

        for (int i = 0; i < 30; i++) {
            automat.erzeugeTasseKaffee(i % 2 == 1);
        }

        schlange.drucke();
    }
}
