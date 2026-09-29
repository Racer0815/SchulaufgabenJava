package Day29_09_2026.Factory;

public class FactoryTest {

    public static void main(String[] args) {

        SmileyFactory lachend =
                new LachenderSmileyFactory();

        SmileyFactory traurig =
                new TraurigerSmileyFactory();

        SmileyFactory wuetend =
                new WuetenderSmileyFactory();

        System.out.println("Lachender Smiley:");
        lachend.zeigeSmiley();

        System.out.println("Trauriger Smiley:");
        traurig.zeigeSmiley();

        System.out.println("Wütender Smiley:");
        wuetend.zeigeSmiley();
    }
}
