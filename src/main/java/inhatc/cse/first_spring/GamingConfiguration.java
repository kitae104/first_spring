package inhatc.cse.first_spring;

import inhatc.cse.first_spring.game.GameRunner;
import inhatc.cse.first_spring.game.GamingConsole;
import inhatc.cse.first_spring.game.MarioGame;
import inhatc.cse.first_spring.game.PackManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        var game = new PackManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
