package Day20_07_2026;

public abstract class Tier {
    String name;
    public Tier(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ich heiße " + this.name;
    }
}
