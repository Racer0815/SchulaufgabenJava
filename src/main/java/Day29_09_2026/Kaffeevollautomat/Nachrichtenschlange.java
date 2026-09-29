package Day29_09_2026.Kaffeevollautomat;

import java.util.ArrayList;
import java.util.List;

public class Nachrichtenschlange {

    private final List<Nachricht> liste = new ArrayList<>();

    public void neueNachricht(Nachricht nachricht) {
        liste.add(nachricht);
    }

    public void drucke() {
        for (int i = 0; i < liste.size(); i++) {
            System.out.print((i + 1) + ". ");
            liste.get(i).drucke();
        }
    }
}
