package Day07_07_2026.Praxis;

import java.util.ArrayList;
import java.util.List;

public class Praxis {

    private ArrayList<Patient> patienten = new ArrayList<>();
    private ArrayList<Behandlung> behandlungen = new ArrayList<>();

    public List<Patient> getPatient(String name) {
        return this.patienten.stream().filter(p -> p.getName().equals(name)).toList();
    }

    public List<Behandlung> getBehandlungen(String kvNummer) {

        return this.behandlungen.stream().filter(b -> b.getKvNummer().equals(kvNummer)).toList();
    }

    public int getAnzahlBehandlungen(String kvNummer) {
        return (int)this.behandlungen.stream().filter(b -> b.getKvNummer().equals(kvNummer)).count();
    }

    public String zeigePatienten(int anzahlBehandlungen) {
        List<Patient> pat = this.patienten.stream().filter(p -> getAnzahlBehandlungen(p.getKvNummer()) >= anzahlBehandlungen).toList();

        return pat.stream().map(Patient::getName).toList().toString();
    }

    public void addPatient(Patient patient) {
        this.patienten.add(patient);
    }
    public void addBehandlung(Behandlung behandlung) {
        this.behandlungen.add(behandlung);
    }

    public double ermittleKosten()
    {
        return this.behandlungen.stream().mapToDouble(Behandlung::getKosten).sum();
    }
}
