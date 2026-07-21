package Day20_07_2026;

public class Loewe extends Tier{
    String mShampooMarke;
    public Loewe(String name) {
        super(name);
    }

    public Loewe(String name, String mShampooMarke) {
        super(name);
        this.mShampooMarke = mShampooMarke;
    }

    @Override
    public String toString(){
        return "Ich heiße " + this.name + " und ich habe " + this.mShampooMarke + " Shampoo.";
    }
}
