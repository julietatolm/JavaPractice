package lesson_12_02_tasks.game.game_hw;

public enum League {
    FIRST_LEAGUE("First league", 1, CONSTANT.MIN_ALLOWED_AGE, 15),
    SECOND_LEAGUE("Second league", 2, 16, 20),
    THIRD_LEAGUE("Third league", 3,21, 30),
    FOURTH_LEAGUE("Fourth league", 4,31, CONSTANT.MAX_ALLOWED_AGE);

    String name;
    int level;
    int minAge;
    int maxAge;

    League(String name, int level, int minAge, int maxAge) {
        this.name = name;
        this.level = level;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }
}
