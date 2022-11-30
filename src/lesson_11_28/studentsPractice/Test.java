package lesson_11_28.studentsPractice;

//Студент записывает книги которые прочитал, задача вывести все прочитанные книги
// у всех студентов (в качестве дополнения, применить фильтр на любую тему)

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student("001", "Aleks", "Groz");
        s1.addBook("Java 8 extended");
        s1.addBook("String boot in action");
        s1.addBook("Effective Java");

        Student s2 = new Student("002", "Max", "Konnad");
        s2.addBook("Effective Java");
        s2.addBook("Introduction to HTML");

        Student s3 = new Student("003", "Ivan", "Weller");
        s3.addBook("Effective Java");
        s3.addBook("Introduction to HTML");

        List<Student> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        processStudents(listStud);
    }

    static void processStudents(List<Student> students) {
        Stream<Student> studentStream = students.stream();

        Stream<Set<String>> booksStream = studentStream.map((x) -> x.getBooks());

        Stream<String> booksNamesStream = booksStream.flatMap((Set x) -> x.stream());

        Stream<String> filteredBooks =
                booksNamesStream.filter((String sBookName) -> sBookName.contains("Java"));

        Set<String> books = filteredBooks.collect(Collectors.toSet());

        System.out.println(books);

        Map<String, Set<String>> result = students.stream().collect(Collectors.toMap(
                s1 -> s1.getId(),
                s1 -> s1.getBooks()
        ));

//        Map<String, Set<String>> result2 = students.stream().collect(Collectors.toMap(
//                Student::getId,
//                Student::getBooks
//        ));

        System.out.println(result);

        Stream<Map.Entry<String, Set<String>>> mapStream = result.entrySet().stream();

        Stream<Map.Entry<String, Set<String>>> mS1 = mapStream.filter(x -> !x.getKey()
                .contains("001"));

        Map<String, Set<String>> ms2 = mS1.collect(Collectors.toMap(
                s1 -> s1.getKey(),
                s1 -> s1.getValue()
        ));





    }
}
