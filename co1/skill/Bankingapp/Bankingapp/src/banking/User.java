package banking;

public class User {
	private static User instance;
    private boolean isLoggedIn;
    private String loggedInUser;

    private User() {
      
        isLoggedIn = false;
        loggedInUser = null;

}
    public static synchronized User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void login(String username) {
        isLoggedIn = true;
        loggedInUser = username;
    }

    public void logout() {
        isLoggedIn = false;
        loggedInUser = null;
    }

    public String getLoggedInUser() {
        return loggedInUser;
    }
}
