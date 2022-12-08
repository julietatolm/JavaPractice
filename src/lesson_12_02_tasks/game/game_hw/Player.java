package lesson_12_02_tasks.game.game_hw;

import com.github.javafaker.Faker;
import lombok.Getter;

@Getter
public class Player {
    private String name;
    private int age;
    private static int playerCounter = 0;
    private int id = 0;
    private int points = 0;
    private int gamesCounter = 0;
    private League league;
    private League originalLeague;


    public Player(League league) {
        Faker fake = new Faker();
        this.age = fake.number().numberBetween(league.minAge, league.maxAge);
        this.name = fake.name().fullName();
        this.league = league;
        this.originalLeague = league;
        playerCounter++;
        this.id = playerCounter;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", points=" + points +
                ", id =" + id +
                ", league =" + league +
                ", originalLeague =" + originalLeague +
                ", gamesCounter =" + gamesCounter +
                '}' + "\n";
    }

    public void addWinPoints() {
        this.points++;
    }

    public void addGamesCounter() {
        this.gamesCounter++;
    }

    public void setHigherLeague() {
        int currentLeague = this.getLeague().level;
        for (League league1 : League.values()) {
            if (league1.level == currentLeague + 1) {
                this.league = league1;
            }
        }
    }

    public void setGamesCounterToZero() {
        this.gamesCounter = 0;
    }

    public void setLowerLeague() {
        int currentLeague = this.getLeague().level;
        for (League league1 : League.values()) {
            if (league1.level == currentLeague - 1) {
                this.league = league1;
            }
        }
    }
}

