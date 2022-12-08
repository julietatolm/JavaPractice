package lesson_12_02_tasks.game.game_hw;

import lesson_12_02_tasks.game.game_hw.game.Game;

public class Test {
    public static void main(String[] args) {
        Players players = Players.generatePlayers();

//        System.out.println(players.getPlayersList());

        Game game = new Game(players);
        game.playGame();
        game.playGame();
        game.playGame();
        game.playGame();
        game.playGame();
        System.out.println("---------------------------------");

        Results.getGameResults(game);

//        System.out.println(players.getPlayersList());



    }
}
