package lesson_12_02_tasks.game.game_hw.game;

import lesson_12_02_tasks.game.game_hw.League;
import lesson_12_02_tasks.game.game_hw.Player;
import lesson_12_02_tasks.game.game_hw.Players;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GameMethods {


    static Player getRandomPlayer(List<Player> leaguePlayers) {
        Random random = new Random();
        int randomPP = random.nextInt(leaguePlayers.size());
        return leaguePlayers.get(randomPP);
    }

    //get filtered list of players of one League
    static List<Player> getPlayersByLeague(League league, Players players) {
        return players.getPlayersList().stream()
                .filter(player -> player.getLeague() == league)
                .collect(Collectors.toList());
    }


    private static List<Player> sortAndReturnThreeBest(League league, Players players) {
        return players.getPlayersList().stream()
                .filter(player -> player.getLeague() == league)
                .sorted((o1, o2) -> {
                    if (o1.getPoints() == o2.getPoints()) {
                        return o1.getGamesCounter() - o2.getGamesCounter();
                    }
                    return o2.getPoints() - o1.getPoints();
                })
                .limit(3)
                .collect(Collectors.toList());
    }


    private static List<Player> sortAndReturnThreeWorse(League league, Players players) {
        int size = getPlayersByLeague(league, players).size();

        return players.getPlayersList().stream()
                .filter(player -> player.getLeague() == league)
                .sorted((o1, o2) -> {
                    if (o1.getPoints() == o2.getPoints()) {
                        return o1.getGamesCounter() - o2.getGamesCounter();
                    }
                    return o2.getPoints() - o1.getPoints();
                })
                .skip(size-3)
                .collect(Collectors.toList());
    }


//    static void showBestPlayersOfTheLeague(League league, Players players) {
//        List<Player> sorted = sortAndReturnThreeBest(league, players);
//
//        for (Player player : sorted) {
//            System.out.println("Place: " + (sorted.indexOf(player) + 1) + " :: Name: "
//                    + player.getName() + " :: Age: " + player.getAge() + " :: " +
//                    "Points: " + player.getPoints() + " :: " + player.getOriginalLeague().getName() + " -> " + player.getLeague().getName());
//        }
//    }
//
//    static void showWorsePlayersOfTheLeague(League league, Players players) {
//        List<Player> threeWorsePlayers = sortAndReturnThreeWorse(league, players);
//
//        for (Player player : threeWorsePlayers) {
//            System.out.println("Place: " + (threeWorsePlayers.indexOf(player) + 1) + " :: Name: "
//                    + player.getName() + " :: Age: " + player.getAge() + " :: " +
//                    "Points: " + player.getPoints() + " :: " + player.getOriginalLeague().getName() + " -> " + player.getLeague().getName());
//        }
//    }


    static void movePlayersToHigherLeague(League league, Players players) {
        List<Player> threeFirst = sortAndReturnThreeBest(league, players);

        if (league != League.FOURTH_LEAGUE) {
            for (Player player : threeFirst) {
                player.setHigherLeague();
            }
//            System.out.println("Winners of " + league.getName() + " have been moved to a higher league");
        }
//        else {
//            System.out.println(league.getName() + " - It is already the higher league. No players moved");
//        }
    }

    static void movePlayersToLowerLeague(League league, Players players) {
        List<Player> threeWorsePlayers = sortAndReturnThreeWorse(league, players);

        if (league != League.FIRST_LEAGUE) {
            for (Player player : threeWorsePlayers) {
                player.setLowerLeague();
            }
//            System.out.println("Losers of " + league.getName() + " have been moved to a lower league");
//        } else {
//            System.out.println(league.getName() + " - It is already the lower league. No players moved");
        }
    }


}
