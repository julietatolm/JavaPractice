package lesson_12_02_tasks.game.game_hw;

public class Test {
    public static void main(String[] args) {
        Players players = new Players();
        players.generatePlayers();

//        System.out.println(players.getPlayersList());

        Game game = new Game();
        game.playOneGameForLeague(League.FIRST_LEAGUE, players);
        game.playOneGameForLeague(League.SECOND_LEAGUE, players);
        game.playOneGameForLeague(League.THIRD_LEAGUE, players);
        game.playOneGameForLeague(League.FOURTH_LEAGUE, players);

        System.out.println("---------------------------------");
        game.movePlayers(players);

        System.out.println("---------------------------------");
        game.playOneGameForLeague(League.FIRST_LEAGUE, players);
        game.playOneGameForLeague(League.SECOND_LEAGUE, players);
        game.playOneGameForLeague(League.THIRD_LEAGUE, players);
        game.playOneGameForLeague(League.FOURTH_LEAGUE, players);

//        System.out.println(players.getPlayersList());



    }
}
