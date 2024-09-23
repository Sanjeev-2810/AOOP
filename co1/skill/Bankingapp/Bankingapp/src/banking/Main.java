package banking;

public class Main {

	public static void main(String[] args) {
		 User session = User.getInstance();

	        Bankops bankOps = new Bankops();

	      
	        bankOps.viewBalance();
	        bankOps.deposit(100.0);
	        bankOps.withdraw(50.0);

	        session.login("JohnDoe");

	        bankOps.viewBalance();
	        bankOps.deposit(100.0);
	        bankOps.withdraw(50.0);

	        session.logout();

	        bankOps.viewBalance();
	        bankOps.deposit(100.0);
	        bankOps.withdraw(50.0);
		// TODO Auto-generated method stub

	}

}
