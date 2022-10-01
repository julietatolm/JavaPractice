package lesson_09_26_reference;

public class TestCopyObject {
    public static void main(String[] args) throws CloneNotSupportedException {

        Book pinokkio = new Book("Pinokkio", new Author("Author1", 1));
        pinokkio.print();

        Book miracle = pinokkio.clone();
        miracle.setName("Miracle");
        miracle.print();

        miracle.setAuthor(new Author("Author2", 2));
        miracle.print();

    }
}
