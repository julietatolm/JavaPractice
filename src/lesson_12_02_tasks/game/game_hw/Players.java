package lesson_12_02_tasks.game.game_hw;

import lesson_12_02_tasks.game.game_hw.game.CONSTANT;

import java.util.ArrayList;
import java.util.List;

public class Players {
    private final List<Player> playersList;

    private Players() {
        this.playersList = new ArrayList<>();
    }

    public List<Player> getPlayersList() {
        return playersList;
    }

    public static Players generatePlayers() {
        Players players = new Players();
        //for each league generate N number of random players and add them to the List of players
        for(League league : League.values()) {
            int playersPerLeagueQuantity = CONSTANT.PLAYERS_PER_LEAGUE;
            while (playersPerLeagueQuantity != 0) {
                players.playersList.add(new Player(league));
                playersPerLeagueQuantity--;
            }
        }
        System.out.println(players.playersList.size() + " players generated"  + " :: " + CONSTANT.PLAYERS_PER_LEAGUE +
                " " +
                "players per league");
        System.out.println("====================================");
        return players;
    }

    public void setGamesCounterToZero() {
        this.playersList
                .forEach(Player::setGamesCounterToZero);
    }



}
