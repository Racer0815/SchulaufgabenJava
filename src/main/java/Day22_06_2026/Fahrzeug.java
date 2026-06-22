package Day22_06_2026;

public class Fahrzeug {
    protected double tankinhalt;

    Fahrzeug(){}
    Fahrzeug(double tankinhalt)
    {
        this.tankinhalt = tankinhalt;
    }

    public void setTankinhalt(double tankinhalt)
    {
        this.tankinhalt = tankinhalt;
    }

    public double getTankinhalt()
    {
        return tankinhalt;
    }
}
