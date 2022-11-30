package lesson_11_07_tree.comparators;

import lesson_11_07_tree.Student;

import java.util.Comparator;

public class SortByAgeAndName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() - o2.getAge() == 0) {
//            return o1.getName() - o2.getName();
        } else
            return o1.getAge() - o2.getAge();
        return 0;
    }
}
