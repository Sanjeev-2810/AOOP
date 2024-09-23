// Controller: Main.java
public class Main {
    public static void main(String[] args) {
        // Create a registry for patients
        PatientRegistry registry = new PatientRegistry();

        // Add patients
        registry.addPatient(new Patient("P001", "John Doe", 45, "Flu"));
        registry.addPatient(new Patient("P002", "Jane Smith", 30, "Broken Leg"));
        registry.addPatient(new Patient("P003", "Mary Johnson", 70, "Diabetes"));

        // Display unsorted patients
        System.out.println("Unsorted Patients:");
        registry.displayPatients();

        // Sort patients by age (natural ordering using Comparable)
        System.out.println("\nSorted Patients by Age (Comparable):");
        registry.sortPatients();
        registry.displayPatients();

        // Sort patients by condition (using Comparator)
        System.out.println("\nSorted Patients by Condition (Comparator):");
        registry.sortPatientsByCondition();
        registry.displayPatients();

        // Iterate over the patients
        System.out.println("\nIterating over Patients:");
        for (Patient patient : registry) {
            System.out.println(patient);
        }

        // Clone a patient
        System.out.println("\nCloning Patient P001:");
        try {
            Patient clonedPatient = (Patient) registry.iterator().next().clone();
            System.out.println("Cloned Patient: " + clonedPatient);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
