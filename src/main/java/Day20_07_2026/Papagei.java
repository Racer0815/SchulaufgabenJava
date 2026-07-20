package Day20_07_2026;

public class Papagei extends Tier{
    String LWort;

    public Papagei(String name, String LWort){
        super(name);
        this.LWort = LWort;
    }

    @Override
    public String toString(){
        return "Ich heiße " + this.name + " und ich kann " + this.LWort + " sprechen.";
    }
}
