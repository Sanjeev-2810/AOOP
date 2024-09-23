package singletonpattern;

public class Main {

	public static void main(String[] args) {
		LoginManager loginManager = LoginManager.getInstance();

        loginManager.login("User1");

        BankingOperations operations = new BankingOperations();

        operations.viewBalance();
        operations.deposit(1000);
        operations.withdraw(500);

        loginManager.logout();

        operations.viewBalance();
    }

}
