// Utility: PatientComparator.java
import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {

    // Sort by condition
    @Override
    public int compare(Patient p1, Patient p2) {
        return p1.getCondition().compareTo(p2.getCondition());
    }
    
    // Alternative: Sort by name (could be used in other scenarios)
    public static Comparator<Patient> sortByName() {
        return Comparator.comparing(Patient::getName);
    }
}
