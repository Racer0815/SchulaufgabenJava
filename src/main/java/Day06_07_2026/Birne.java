package Day06_07_2026;

public class Birne extends Apfel{

    private int num;

    public Birne() {}
    public Birne(int num)
    {
        this.num = num;
    }

    public String getInfo(){
        return  "Birne " + num;
    }
}
