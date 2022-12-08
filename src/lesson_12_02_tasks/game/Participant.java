package lesson_12_02_tasks.game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public abstract class Participant {
    private String name;
    private int age;
}
