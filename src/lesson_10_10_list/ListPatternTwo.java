package lesson_10_10_list;

import java.util.ArrayList;
import java.util.List;

public class ListPatternTwo {
    public static void main(String[] args) {
        List<String> list2 = new ArrayList<>();
        list2.add("I");
        list2.add("am");
        list2.add("learning");
        list2.add("Java");

        List<String> result = new ArrayList<>();

        for (String str : list2) {
            if (str.length() == 4) {
                result.add(str);
            }
        }

        System.out.println(result);

        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(3);
        list3.add(6);
        list3.add(10);

        List<Integer> result2 = new ArrayList<>();

        for (Integer i : list3) {
            if (i % 2 == 0) {
                result2.add(i);
            }
        }

        System.out.println(result2);
    }
}
