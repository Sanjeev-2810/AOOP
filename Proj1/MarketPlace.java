package Proj1;
import java.util.ArrayList;
import java.util.List;

class Marketplace {
    private List<Game> availableGames;

    public Marketplace() {
        this.availableGames = new ArrayList<>();
    }

    public void addGame(Game game) {
        availableGames.add(game);
    }

    public void showAvailableGames() {
        System.out.println("Available Games:");
        for (Game game : availableGames) {
            System.out.println("- " + game.getTitle() + " ($" + game.getPrice() + ")");
        }
    }

    public Game getGameByTitle(String title) {
        for (Game game : availableGames) {
            if (game.getTitle().equalsIgnoreCase(title)) {
                return game;
            }
        }
        System.out.println("Game not found.");
        return null;
    }
}
