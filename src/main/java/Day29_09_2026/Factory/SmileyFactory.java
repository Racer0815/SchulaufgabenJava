package Day29_09_2026.Factory;

public abstract class SmileyFactory {

    public abstract Smiley createSmiley();

    public void zeigeSmiley() {

        Smiley smiley = createSmiley();

        smiley.anzeigen();
    }
}
