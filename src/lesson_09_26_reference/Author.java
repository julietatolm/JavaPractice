package lesson_09_26_reference;

import lombok.Data;

@Data
public class Author {
    private String name;
    private int rating;

    public Author(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }
}
