package Day07_07_2026.Praxis;

public class Main {
    public static void main(String[] args) {
        Praxis p = new Praxis();

        p.addBehandlung(new Physiobehandlung("A12345", "Chirogymnsatik", 12.87d));
        p.addBehandlung(new Physiobehandlung("A12345", "Wärmeanwendung", 4.23d));
        p.addBehandlung(new StandartBehandlung("A12345", "Arthrose", 45.12d));
        p.addBehandlung(new StandartBehandlung("A12345", "Ultraschall", 26.80d));

        System.out.println(p.ermittleKosten());

    }
}
