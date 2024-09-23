package Proj1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

    private User user;
    private Game game;

    @BeforeEach
    void setUp() {
        user = new User("JohnDoe", 100.00);
        game = new Game("CyberQuest", 30.00);
    }

    @Test
    void testBuyGameWithSufficientFunds() {
        user.buyGame(game);
        assertTrue(user.getPurchasedGames().contains(game), "User should own the game after purchase.");
        assertEquals(70.00, user.getWalletBalance(), "Wallet balance should be deducted after game purchase.");
    }

    @Test
    void testBuyGameWithInsufficientFunds() {
        Game expensiveGame = new Game("ExpensiveGame", 200.00);
        user.buyGame(expensiveGame);
        assertFalse(user.getPurchasedGames().contains(expensiveGame), "User should not own the game due to insufficient funds.");
        assertEquals(100.00, user.getWalletBalance(), "Wallet balance should remain the same if the purchase fails.");
    }

    @Test
    void testDownloadPurchasedGame() {
        user.buyGame(game);
        user.downloadGame(game);
        assertEquals(1, game.getDownloads(), "Downloads should increase when user downloads the game.");
    }

    @Test
    void testDownloadUnpurchasedGame() {
        Game unpurchasedGame = new Game("SpaceWars", 40.00);
        user.downloadGame(unpurchasedGame);
        assertEquals(0, unpurchasedGame.getDownloads(), "Downloads should not increase for unpurchased games.");
    }

    @Test
    void testLeaveReviewForGame() {
        user.buyGame(game);
        user.leaveReview(game, "Amazing game!");
        // Since reviews are currently just printed, this doesn't modify state, so no assertions here.
    }
}