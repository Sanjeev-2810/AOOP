package Proj2;

public class Main {
    public static void main(String[] args) {
        // Create users (observers)
        User user1 = new User("Sanjeev");
        User user2 = new User("Saya");

        // Create task (subject)
        Task task = new Task("Build Feature X");
        Task task1 = new Task("Build React APP");
        // Add observers to the task
        task.addObserver(user1);
        task.addObserver(user2);
        task1.addObserver(user1);
        // Change task status, observers will be notified
        task.setStatus("In Progress");
        
        // Change task status again, observers will be notified again
        task.setStatus("Completed");

        // Remove one observer and change the status again
        task.removeObserver(user2);
        task.setStatus("Reviewed");
    }
}
