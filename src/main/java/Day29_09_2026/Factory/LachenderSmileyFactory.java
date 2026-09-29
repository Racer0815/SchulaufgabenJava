package Day29_09_2026.Factory;

public class LachenderSmileyFactory
        extends SmileyFactory {

    @Override
    public Smiley createSmiley() {
        return new LachenderSmiley();
    }
}
