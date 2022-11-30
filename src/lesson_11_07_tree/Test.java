package lesson_11_07_tree;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Student, Integer> map = new TreeMap<>();
        map.put(new Student(33, "Aleks"), 33);
        map.put(new Student(19, "Thea"), 19);
        map.put(new Student(23, "Thomas"), 233);
        map.put(new Student(50, "Alla"), 111);

        System.out.println(map);
    }
}
