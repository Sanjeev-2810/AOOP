package Proj2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskTest {

    private Task task;
    private User user1;
    private User user2;

    @BeforeEach
    public void setup() {
        task = new Task("Build Feature X");
        user1 = new User("Alice");
        user2 = new User("Bob");
    }

    @Test
    public void testAddObserver() {
        task.addObserver(user1);
        task.addObserver(user2);

        // Set task status, observers should be notified
        task.setStatus("In Progress");
        
        // We can't directly assert notifications since they're printed,
        // but we expect that the console will show both users were notified.
    }

    @Test
    public void testRemoveObserver() {
        task.addObserver(user1);
        task.addObserver(user2);
        
        // Remove user2 and then change the task status
        task.removeObserver(user2);
        task.setStatus("Completed");

        // Expect only user1 to be notified
        // Visually, we should see that only Alice gets the update
    }

    @Test
    public void testMultipleStatusUpdates() {
        task.addObserver(user1);
        task.addObserver(user2);
        
        // Change status multiple times
        task.setStatus("In Progress");
        task.setStatus("Completed");

        // Both users should get two updates each
        // Visually inspect the output to ensure both users are updated twice
    }
}
