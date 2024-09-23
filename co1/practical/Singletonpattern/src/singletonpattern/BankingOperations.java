package singletonpattern;

public class BankingOperations {
	public void viewBalance() {
        LoginManager loginManager = LoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            System.out.println("Displaying balance for " + loginManager.getLoggedInUser());
          
        } else {
            System.out.println("Please login to view your balance.");
        }
    }

    public void deposit(double amount) {
        LoginManager loginManager = LoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            System.out.println(loginManager.getLoggedInUser() + " is depositing " + amount);
          
        } else {
            System.out.println("Please login to deposit money.");
        }
    }

    public void withdraw(double amount) {
        LoginManager loginManager = LoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            System.out.println(loginManager.getLoggedInUser() + " is withdrawing " + amount);
          
        } else {
            System.out.println("Please login to withdraw money.");
        }
    }
}
