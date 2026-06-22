package Day09_06_2026;

public class Katze implements Animal{
    String name;
    @Override
    public void gibLaut() {
        System.out.println("Meow");
    }

    @Override
    public void jagen() {
        System.out.println(name + " jagt Hund");
    }

    @Override
    public void laufen() {
        System.out.println(name + "läuft");
    }

    @Override
    public void wirdGefüttert() {
        System.out.println(name + " ist satt");
    }
}
