package singletonpattern;

public class LoginManager {
	private static LoginManager instance = null;
    private boolean isLoggedIn;
    private String loggedInUser;
    private LoginManager() {
        this.isLoggedIn = false;
        this.loggedInUser = null;
    }
    public static synchronized LoginManager getInstance() {
        if (instance == null) {
            instance = new LoginManager();
        }
        return instance;
    }
    public void login(String username) {
        if (!isLoggedIn) {
            this.loggedInUser = username;
            this.isLoggedIn = true;
            System.out.println(username + " has logged in.");
        } else {
            System.out.println("A user is already logged in. Please log out first.");
        }
    }

    public void logout() {
        if (isLoggedIn) {
            System.out.println(loggedInUser + " has logged out.");
            this.loggedInUser = null;
            this.isLoggedIn = false;
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }
    public String getLoggedInUser() {
        return loggedInUser;
    }
}
