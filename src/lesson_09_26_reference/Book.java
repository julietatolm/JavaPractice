package lesson_09_26_reference;

import lombok.Data;

@Data
public class Book implements Cloneable {
    private String name;
    private Author author;

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.println("Book title: " + name);
        System.out.println("Book author: " + author.getName());
        System.out.println("---------------------");
    }

    protected Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }
}
