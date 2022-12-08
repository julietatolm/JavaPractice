package lesson_12_02_tasks.game.game_hw.game;

import lesson_12_02_tasks.game.game_hw.League;
import lesson_12_02_tasks.game.game_hw.Player;
import lesson_12_02_tasks.game.game_hw.Players;
import lombok.Getter;

import java.util.List;
import java.util.Random;

@Getter
public class Game {
    Players players;

    public Game(Players players) {
        this.players = players;
    }

    public void playGame() {
        System.out.println("---------------------------------");
        playOneGameForLeague(League.FIRST_LEAGUE);
        playOneGameForLeague(League.SECOND_LEAGUE);
        playOneGameForLeague(League.THIRD_LEAGUE);
        playOneGameForLeague(League.FOURTH_LEAGUE);
        System.out.println("---------------------------------");
        System.out.println("Game finished!");
        System.out.println("---------------------------------");
        movePlayers();
        System.out.println("Players moved!");
    }


    public void playOneGameForLeague(League league) {
        List<Player> leaguePlayers = GameMethods.getPlayersByLeague(league, this.players);

        while (leaguePlayers.size() > 0) {
            playOneGame(leaguePlayers);
        }

//        System.out.println(league.getName() + " game finished!");

//        System.out.println(league.getName() + " winners:");
//        GameMethods.showBestPlayersOfTheLeague(league, this.players);

//        System.out.println(league.getName() + " losers:");
//        GameMethods.showWorsePlayersOfTheLeague(league, this.players);

        this.players.setGamesCounterToZero();
    }

    private void movePlayers() {
        for (League league : League.values()) {
            GameMethods.movePlayersToHigherLeague(league, players);
            GameMethods.movePlayersToLowerLeague(league, players);
        }
    }



    private void playOneGame(List<Player> leaguePlayers) {
        if (leaguePlayers.size() == 1) {
            Player playerOne = leaguePlayers.get(0);
            playerOne.addWinPoints();
            playerOne.addGamesCounter();
            leaguePlayers.remove(playerOne);
            return;
        }

        Player playerOne = GameMethods.getRandomPlayer(leaguePlayers);
        Player playerTwo = GameMethods.getRandomPlayer(leaguePlayers);

        while (playerOne == playerTwo) {
            playerTwo = GameMethods.getRandomPlayer(leaguePlayers);
        }

        Random random = new Random();
        int res = random.nextInt(2);
        if (res == 0) {
            playerOne.addWinPoints();
        } else {
            playerTwo.addWinPoints();
        }
        playerOne.addGamesCounter();
        playerTwo.addGamesCounter();

        if (playerOne.getGamesCounter() == CONSTANT.PLAYS_PER_GAME) {
            leaguePlayers.remove(playerOne);
        }
        if (playerTwo.getGamesCounter() == CONSTANT.PLAYS_PER_GAME) {
            leaguePlayers.remove(playerTwo);
        }
    }
}
