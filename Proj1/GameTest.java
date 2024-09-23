package Proj1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    void testGameDownload() {
        Game game = new Game("CyberQuest", 30.00);
        
        assertEquals(0, game.getDownloads(), "Initial downloads should be 0.");
        
        game.download();
        
        assertEquals(1, game.getDownloads(), "Downloads should increase by 1.");
    }
}
