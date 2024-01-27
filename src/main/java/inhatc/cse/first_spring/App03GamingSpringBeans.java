package inhatc.cse.first_spring;

import inhatc.cse.first_spring.game.GameRunner;
import inhatc.cse.first_spring.game.GamingConsole;
import inhatc.cse.first_spring.game.PackManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans
{

	public static void main(String[] args)
	{
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class))
		{
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}
