package factory;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game=Game.getInstance();
		// Set easy level factory and play the game
		GameElementFactory easyLevelFactory=new EasyLevelFactory();
		game.setLevelFactory(easyLevelFactory);
		game.play();
		System.out.println("------------");
		// Set hard level factory and play the game
		GameElementFactory hardLevelFactory=new HardLevelFactory();
		game.setLevelFactory(hardLevelFactory);
		game.play();
		}

	}


