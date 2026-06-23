package Day22_06_2026;

public class LKW extends Fahrzeug{
    private double verbrauch;

    LKW(){}
    LKW(double verbrauch)
    {
        this.verbrauch = verbrauch;
    }

    public void setVerbrauch(double verbrauch){
        this.verbrauch = verbrauch;
    }

    public double getVerbrauch(){
        return this.verbrauch;
    }

    public void fahren(int km)
    {

    }

}
