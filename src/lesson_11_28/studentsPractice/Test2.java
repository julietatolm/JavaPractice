package lesson_11_28.studentsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//First level: Using groupingBy in Collectors method:
//Count number of students with same Second name
//How many users red the same book

public class Test2 {
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

        Student s4 = new Student("004", "Miron", "Weller");
        s4.addBook("Effective Java");
        s4.addBook("Introduction to HTML");

        List<Student> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        processStudentsBySurname(listStud);
        processStudentsByBooks(listStud);
    }

    static void processStudentsBySurname(List<Student> students) {
//        Using groupingBy in Collectors method:
//        Count number of students with same Second name

        List<Map.Entry<String, Long>> collectorGroupBy = students.stream().collect(Collectors.groupingBy(
                        Student::getSurname,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .collect(Collectors.toList());

        System.out.println(collectorGroupBy);
    }


    static void processStudentsByBooks(List<Student> students) {
        ////How many users red the same book
        Map one = students.stream().map(x -> x.getBooks())
                .flatMap(x -> x.stream())
                .collect(Collectors.toMap(
                        s1 -> s1,
                        s1 -> 1,
                        Integer::sum
                ));

        System.out.println(one);
    }
}
