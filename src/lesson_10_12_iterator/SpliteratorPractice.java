package lesson_10_12_iterator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Spliterator<Integer> spliterator = list.spliterator();

        System.out.println(spliterator.estimateSize());


        System.out.println(spliterator.getExactSizeIfKnown());

        System.out.println(spliterator.characteristics());

        Comparator<? super Integer> comparator = spliterator.getComparator();
    }
}
