package Proj1;
import java.util.*;

class User {
    private String username;
    private double walletBalance;
    private List<Game> purchasedGames;

    public User(String username, double walletBalance) {
        this.username = username;
        this.walletBalance = walletBalance;
        this.purchasedGames = new ArrayList<>();
    }

    public void buyGame(Game game) {
        if (walletBalance >= game.getPrice()) {
            walletBalance -= game.getPrice();
            purchasedGames.add(game);
            System.out.println("Game purchased: " + game.getTitle());
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void downloadGame(Game game) {
        if (purchasedGames.contains(game)) {
            game.download();
        } else {
            System.out.println("You need to buy the game first.");
        }
    }

    public void leaveReview(Game game, String review) {
        System.out.println("Review for " + game.getTitle() + ": " + review);
    }

    public double getWalletBalance() {
        return walletBalance;
    }
    public List<Game> getPurchasedGames() {
        return purchasedGames;
    }
}
