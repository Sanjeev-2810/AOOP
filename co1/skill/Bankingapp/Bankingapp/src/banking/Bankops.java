package banking;

public class Bankops {
	 public void viewBalance() {
	        User session = User.getInstance();
	        if (session.isLoggedIn()) {
	            System.out.println("Viewing balance for user: " + session.getLoggedInUser());
	            // Add logic to view balance
	        } else {
	            System.out.println("Please log in to view balance.");
	        }

}
	 public void deposit(double amount) {
	        User session = User .getInstance();
	        if (session.isLoggedIn()) {
	            System.out.println("Depositing " + amount + " for user: " + session.getLoggedInUser());
	            // Add logic to deposit money
	        } else {
	            System.out.println("Please log in to deposit money.");
	        }
	    }

	    public void withdraw(double amount) {
	        User session = User.getInstance();
	        if (session.isLoggedIn()) {
	            System.out.println("Withdrawing " + amount + " for user: " + session.getLoggedInUser());
	            // Add logic to withdraw money
	        } else {
	            System.out.println("Please log in to withdraw money.");
	        }
	    }
	}
