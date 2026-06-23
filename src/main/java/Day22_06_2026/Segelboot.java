package Day22_06_2026;

public class Segelboot extends Fahrzeug{
    private double segelgroesse;

    Segelboot(){}
    Segelboot(double segelgroesse)
    {
        this.segelgroesse = segelgroesse;
    }

    public double getSegelgroesse() {
        return this.segelgroesse;
    }

    public void setSegelgroesse(double segelgroesse) {
        this.segelgroesse = segelgroesse;
    }

    public void fahren(int km)
    {
    }
}
