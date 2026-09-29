package Day29_09_2026.Factory;

public class WuetenderSmileyFactory
        extends SmileyFactory {

    @Override
    public Smiley createSmiley() {
        return new WuetenderSmiley();
    }
}
