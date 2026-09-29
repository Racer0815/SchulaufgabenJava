package Day29_09_2026.Kaffeevollautomat;

public class Geraet {

    private final String id;
    protected boolean defekt = false;
    protected final Nachrichtenschlange schlange;

    public Geraet(String id, Nachrichtenschlange schlange) {
        this.id = id;
        if (schlange == null) {
            throw new IllegalArgumentException("Die Nachrichtenschlange darf nicht null sein.");
        }
        this.schlange = schlange;
    }

    public String holeId() {
        return id;
    }
}
