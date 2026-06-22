package Day09_06_2026;

public class Hund implements Animal
{
    private String _name;

    public Hund(String name)
    {
        this._name = name;
    }

    public String GetName()
    {
        return _name;
    }

    @Override
    public void gibLaut() {
        System.out.println("Wau Wau");
    }

    @Override
    public void jagen() {
        System.out.println(name + " jagt Katze");
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
