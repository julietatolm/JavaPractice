package lesson_12_02_tasks.game.game_hw;

import lesson_12_02_tasks.game.game_hw.game.CONSTANT;
import lombok.Getter;

@Getter
public enum League {
    FIRST_LEAGUE("First league", 1, CONSTANT.MIN_ALLOWED_AGE, 20),
    SECOND_LEAGUE("Second league", 2, 21, 30),
    THIRD_LEAGUE("Third league", 3,31, 40),
    FOURTH_LEAGUE("Fourth league", 4,41, CONSTANT.MAX_ALLOWED_AGE);

    final String name;
    final int level;
    final int minAge;
    final int maxAge;

    League(String name, int level, int minAge, int maxAge) {
        this.name = name;
        this.level = level;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }
}
