package lesson_12_02_tasks.game.game_hw;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Players {
    private List<Player> playersList;

    public Players() {
        this.playersList = new ArrayList<>();
    }

    public List<Player> getPlayersList() {
        return playersList;
    }

    public void generatePlayers() {
        for(League league : League.values()) {
            int playersPerLeagueQuantity = CONSTANT.PLAYERS_PER_LEAGUE;
            while (playersPerLeagueQuantity != 0) {
                playersList.add(new Player(league));
                playersPerLeagueQuantity--;
            }
        }
        System.out.println(playersList.size() + " players generated"  + ": " + CONSTANT.PLAYERS_PER_LEAGUE + " " +
                "players per league");
        System.out.println("====================================");
    }


}
