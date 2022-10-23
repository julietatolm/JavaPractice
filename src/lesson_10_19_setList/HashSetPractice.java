package lesson_10_19_setList;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> hashset1 = new HashSet<>();
        HashSet hashset2 = new HashSet<>(new ArrayList<>());
        HashSet hashset3 = new HashSet<>(100);
        HashSet hashset4 = new HashSet<>(1000000, 0.75F); // load factor -> 0 - 1

        hashset1.add("A");
        hashset1.add("B");
        hashset1.add("A");
    }
}
