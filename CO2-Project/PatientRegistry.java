// Service: PatientRegistry.java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PatientRegistry implements Iterable<Patient> {
    private List<Patient> patients;

    public PatientRegistry() {
        patients = new ArrayList<>();
    }

    // Add a patient
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Remove a patient
    public void removePatient(String id) {
        patients.removeIf(patient -> patient.getId().equals(id));
    }

    // Implement Iterator for the Patient class
    @Override
    public Iterator<Patient> iterator() {
        return patients.iterator();
    }

    // Sort patients (uses natural ordering by age)
    public void sortPatients() {
        patients.sort(null); // Comparable is used here (natural order)
    }

    // Sort patients using a custom comparator (e.g., by condition)
    public void sortPatientsByCondition() {
        patients.sort(new PatientComparator());
    }
    
    // Display all patients
    public void displayPatients() {
        patients.forEach(System.out::println);
    }
}
