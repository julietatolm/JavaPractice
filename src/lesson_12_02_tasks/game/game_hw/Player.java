package lesson_12_02_tasks.game.game_hw;

import com.github.javafaker.Faker;
import lombok.Getter;

@Getter
public class Player implements Playable {
    private final String name;
    private final int age;
    private int points = 0;
    private int gamesCounter = 0;
    private League league;
    private final League originalLeague;


    public Player(League league) {
        Faker fake = new Faker();
        this.age = fake.number().numberBetween(league.minAge, league.maxAge);
        this.name = fake.name().fullName();
        this.league = league;
        //original - to track the change of the player between leagues
        this.originalLeague = league;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", points=" + points +
                ", league =" + league +
                ", originalLeague =" + originalLeague +
                ", gamesCounter =" + gamesCounter +
                '}' + "\n";
    }

    @Override
    public void addWinPoints() {
        this.points++;
    }

    @Override
    public void addGamesCounter() {
        this.gamesCounter++;
    }

    @Override
    public void setHigherLeague() {
        int currentLeague = this.getLeague().getLevel();
        for (League league1 : League.values()) {
            if ((currentLeague + 1) == league1.getLevel()) {
                this.league = league1;
            }
        }
    }

    @Override
    public void setGamesCounterToZero() {
        this.gamesCounter = 0;
    }

    @Override
    public void setLowerLeague() {
        int currentLeague = this.getLeague().getLevel();
        for (League league1 : League.values()) {
            if ((currentLeague - 1) == league1.level) {
                this.league = league1;
            }
        }
    }
}

