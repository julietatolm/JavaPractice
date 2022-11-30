package lesson_11_28.studentsPractice;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private String id;
    private String name;
    private String surname;
    private Set<String> books = new HashSet<String>();

    public Student(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public void addBook( String bookName ) {
        books.add(bookName);
    }

    public Set<String> getBooks() {
        return new HashSet<String>(books);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
