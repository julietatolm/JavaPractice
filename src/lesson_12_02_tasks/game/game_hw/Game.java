package lesson_12_02_tasks.game.game_hw;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Game {
    private List<Players> sorted;

    public void playOneGameForLeague(League league, Players players) {
//        System.out.println(league.name + " game started!");
        List<Player> leaguePlayers =
                players.getPlayersList().stream()
                        .filter(player -> player.getLeague() == league)
                        .collect(Collectors.toList());

        while (leaguePlayers.size() > 0) {
            playOneGame(leaguePlayers);
        }

        System.out.println(league.name + " game finished!");
        System.out.println(league.name + " winners:");
        showBestPlayersOfTheLeague(league, players);
        System.out.println(league.name + " losers:");
        showWorsePlayersOfTheLeague(league, players);
        setGamesCounterToZero(league, players);
    }



    private void setGamesCounterToZero(League league, Players players) {
                players.getPlayersList().stream()
                        .filter(player -> player.getLeague() == league)
                        .forEach(Player::setGamesCounterToZero);
    }


    private void showBestPlayersOfTheLeague(League league, Players players) {
        List<Player> sorted = sortPlayers(league, players).stream().limit(3).collect(Collectors.toList());

        for (Player player : sorted) {
            System.out.println("Place: " + (sorted.indexOf(player) + 1) + " :: Name: "
                    + player.getName() + " :: Age: " + player.getAge() + " :: " +
                    "Points: " + player.getPoints() + " :: " + player.getOriginalLeague().name + " -> " + player.getLeague().name);
        }
    }

    private void showWorsePlayersOfTheLeague(League league, Players players) {
        List<Player> sorted = sortPlayers(league, players);
        int playersQuantity = sorted.size();
        List<Player> threeWorsePlayers = sorted.stream().skip(playersQuantity-3).collect(Collectors.toList());

        for (Player player : threeWorsePlayers) {
            System.out.println("Place: " + (sorted.indexOf(player) + 1) + " :: Name: "
                    + player.getName() + " :: Age: " + player.getAge() + " :: " +
                    "Points: " + player.getPoints() + " :: " + player.getOriginalLeague().name + " -> " + player.getLeague().name);
        }
    }

    private List<Player> sortPlayers(League league, Players players) {
        return players.getPlayersList().stream()
                .filter(player -> player.getLeague() == league)
                .sorted((o1, o2) -> {
                    if (o1.getPoints() == o2.getPoints()) {
                        return o1.getGamesCounter() - o2.getGamesCounter();
                    }
                    return o2.getPoints() - o1.getPoints();
                })
                .collect(Collectors.toList());
    }

    public void movePlayers(Players players) {
        for (League league : League.values()) {
            movePlayersToHigherLeague(league, players);
            movePlayersToLowerLeague(league, players);
            System.out.println();
        }
    }

    private void movePlayersToHigherLeague(League league, Players players) {
        List<Player> threeFirst = sortPlayers(league, players).stream().limit(3).collect(Collectors.toList());
        if (league != League.FOURTH_LEAGUE) {
            for (Player player : threeFirst) {
                player.setHigherLeague();
            }
            System.out.println("Winners of " + league.name + " have been moved to a higher league");
        } else {
            System.out.println(league.name + " - It is already the higher league. No players moved");
        }
    }

    private void movePlayersToLowerLeague(League league, Players players) {
        List<Player> sorted = sortPlayers(league, players);
        int playersQuantity = sorted.size();
        List<Player> threeWorsePlayers = sorted.stream().skip(playersQuantity-3).collect(Collectors.toList());

        if (league != League.FIRST_LEAGUE) {
            for (Player player : threeWorsePlayers) {
                player.setLowerLeague();
            }
            System.out.println("Losers of " + league.name + " have been moved to a lower league");
        } else {
            System.out.println(league.name + " - It is already the lower league. No players moved");
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

        Player playerOne = getRandomPlayer(leaguePlayers);
        Player playerTwo = getRandomPlayer(leaguePlayers);

        while (playerOne == playerTwo) {
            playerTwo = getRandomPlayer(leaguePlayers);
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

    private Player getRandomPlayer(List<Player> leaguePlayers) {
        Random random = new Random();
        int randomPP = random.nextInt(leaguePlayers.size());
        return leaguePlayers.get(randomPP);
    }
}
