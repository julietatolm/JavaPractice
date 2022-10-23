package lesson_10_19_setList;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetPractice {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();

        sortedSet.add("A");
        sortedSet.add("B");
        sortedSet.add("C");
        sortedSet.add("A");

        System.out.println(sortedSet);

        String d = "D";
        System.out.println("Contains " + d + " " + sortedSet.contains(d));


    }
}
