package Proj2;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String status) {
        System.out.println("User " + name + " received update: Task '" + taskName + "' status changed to '" + status + "'.");
    }

    public String getName() {
        return name;
    }
}
