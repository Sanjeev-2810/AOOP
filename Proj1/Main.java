package Proj1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize marketplace and user
        Marketplace marketplace = new Marketplace();
        User user = new User("Sanjeev", 100.00); // $100 initial balance

        // Add games to the marketplace
        Game game1 = new Game("MineCraft", 30.00);
        Game game2 = new Game("Valorant", 40.00);
        Game game3 = new Game("CS:GO", 70.00);
        marketplace.addGame(game1);
        marketplace.addGame(game2);
        marketplace.addGame(game3);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nWelcome to the Game Marketplace");
            System.out.println("1. Show available games");
            System.out.println("2. Buy a game");
            System.out.println("3. Download a game");
            System.out.println("4. Leave a review");
            System.out.println("5. Check wallet balance");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    marketplace.showAvailableGames();
                    break;
                case 2:
                    System.out.print("Enter game title to buy: ");
                    String buyTitle = scanner.nextLine();
                    Game gameToBuy = marketplace.getGameByTitle(buyTitle);
                    if (gameToBuy != null) {
                        user.buyGame(gameToBuy);
                    }
                    break;
                case 3:
                    System.out.print("Enter game title to download: ");
                    String downloadTitle = scanner.nextLine();
                    Game gameToDownload = marketplace.getGameByTitle(downloadTitle);
                    if (gameToDownload != null) {
                        user.downloadGame(gameToDownload);
                    }
                    break;
                case 4:
                    System.out.print("Enter game title to review: ");
                    String reviewTitle = scanner.nextLine();
                    Game gameToReview = marketplace.getGameByTitle(reviewTitle);
                    if (gameToReview != null) {
                        System.out.print("Enter your review: ");
                        String review = scanner.nextLine();
                        user.leaveReview(gameToReview, review);
                    }
                    break;
                case 5:
                    System.out.println("Wallet balance: $" + user.getWalletBalance());
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting marketplace.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
