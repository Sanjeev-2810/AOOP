// Model: Patient.java
public class Patient implements Comparable<Patient>, Cloneable {
    private String id;
    private String name;
    private int age;
    private String condition;

    public Patient(String id, String name, int age, String condition) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.condition = condition;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCondition() { return condition; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCondition(String condition) { this.condition = condition; }

    // Implement Comparable (default sort by age)
    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.age, other.age);
    }

    // Implement Cloneable (to create a copy of a patient)
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ID='" + id + '\'' +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", Condition='" + condition + '\'' +
                '}';
    }
}
