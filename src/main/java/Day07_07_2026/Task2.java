package Day07_07_2026;

import java.util.Vector;

public class Task2 {
    public static void main(String[] args) {

        Vector<String> inputs = new Vector<>();

        for(int i=0; i<5; i++)
        {
            inputs.add("Input " + i);
        }

        for(String var:inputs)
        {
            System.out.println(var);
        }
    }
}
