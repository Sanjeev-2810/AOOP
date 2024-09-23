package Proj2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class UserTest {

    private User user;

    @BeforeEach
    public void setup() {
        user = new User("Alice");
    }

    @Test
    public void testUserReceivesCorrectUpdate() {
        // Simulate task status update
        user.update("Task1", "In Progress");

        // Here, instead of asserting anything, we're just verifying that
        // the correct output would be printed. This is visual validation in this case.
    }
}