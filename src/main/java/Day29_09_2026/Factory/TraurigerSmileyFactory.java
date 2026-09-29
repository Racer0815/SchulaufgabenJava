package Day29_09_2026.Factory;

public class TraurigerSmileyFactory
        extends SmileyFactory {

    @Override
    public Smiley createSmiley() {
        return new TraurigerSmiley();
    }
}