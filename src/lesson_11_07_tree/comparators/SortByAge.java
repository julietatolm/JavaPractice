package lesson_11_07_tree.comparators;

import lesson_11_07_tree.Student;

import java.util.Comparator;

public class SortByAge implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }
}
