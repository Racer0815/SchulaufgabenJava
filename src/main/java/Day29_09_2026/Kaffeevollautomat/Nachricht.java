package Day29_09_2026.Kaffeevollautomat;

public class Nachricht {

    private final String id;
    private final String text;

    public Nachricht(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public void drucke() {
        System.out.println(id + " : " + text);
    }
}
