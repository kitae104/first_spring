package inhatc.cse.first_spring;

import inhatc.cse.first_spring.game.GameRunner;
import inhatc.cse.first_spring.game.MarioGame;
import inhatc.cse.first_spring.game.PackManGame;
import inhatc.cse.first_spring.game.SuperContraGame;

public class App01GamingBasicJava
{

	public static void main(String[] args)
	{
//		var game = new SuperContraGame();
		//var game = new MarioGame();
		var game = new PackManGame();
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();

	}

}
