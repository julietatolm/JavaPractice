package lesson_12_02_tasks.game.game_hw;

import lesson_12_02_tasks.game.game_hw.game.Game;

//Прогнать такую игру 5 раз и вывести на экран
//        1. Тех кто заработал больше всего очков
//        2. Тех кто перешел в лигу выше
//        3. Тех кто перешел в лигу ниже

public class Results {
    static String fourDots = "::";
    static String name = "Name";
    static String age = "Age";
    static String points = "Points";
    static String league = "Original -> Actual League";

    public static void getGameResults(Game game) {
        System.out.println("---------------------------------");
        getBestPlayers(game);
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        getPlayersToHigherLeague(game);
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        getPlayersToLowerLeague(game);
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
    }

    private static void getPlayersToHigherLeague(Game game) {
        System.out.println("Players that were moved to a higher league: ");
        printTableHeader();
        game.getPlayers().getPlayersList()
                .stream().filter(player -> player.getOriginalLeague().getLevel() < player.getLeague().getLevel())
                .forEach(Results::printPlayer);
    }

    private static void printTableHeader() {
        System.out.printf("%25s %5s %5s %5s %10s %5s %40s %n", name, fourDots, age, fourDots, points, fourDots,
                league);
    }

    private static void getPlayersToLowerLeague(Game game) {
        System.out.println("Players that were moved to a lower league: ");
        printTableHeader();

        game.getPlayers().getPlayersList()
                .stream().filter(player -> player.getOriginalLeague().getLevel() > player.getLeague().getLevel())
                .forEach(Results::printPlayer);
    }

    private static void getBestPlayers(Game game) {
        System.out.println("5 Best players: ");
        printTableHeader();

        game.getPlayers().getPlayersList()
                .stream().sorted((pl1, pl2) -> - pl1.getPoints() + pl2.getPoints())
                .limit(5)
                .forEach(Results::printPlayer);
    }

    private static void printPlayer(Player player) {
        System.out.printf("%-25s %5s %5s %5s %10s %5s %40s %n", player.getName(),
                fourDots, player.getAge(),
                fourDots, player.getPoints(),
                fourDots, player.getOriginalLeague().getName() + " -> "
                + player.getLeague().getName());
    }
}
