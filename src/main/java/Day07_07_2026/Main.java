package Day07_07_2026;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Human Klaus = new Human(4, "Klaus");
        Human Friedrich = new Human(3, "Friedrich");
        Human Angie = new Human(12, "Angie");

        Vector<Human> Employees = new Vector<>();

        Employees.add(Klaus);
        Employees.add(Friedrich);
        Employees.add(Angie);
        
        
        for(Human numm:Employees)
        {
            System.out.println(numm.getName());
        }
    }
}
