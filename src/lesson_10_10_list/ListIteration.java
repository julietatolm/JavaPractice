package lesson_10_10_list;

import java.util.ArrayList;
import java.util.List;

public class ListIteration {
    public static void main(String[] args) {
        List<String> list2 = new ArrayList<>();
        list2.add("I");
        list2.add("am");
        list2.add("learning");
        list2.add("Java");

        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();

        for(String str : list2) {
            System.out.print(str + " ");
        }
        System.out.println();

        List<String> list3 = list2;

        System.out.println(list2.size());

        System.out.println("List3 " + list3);
//        list3.clear();
        System.out.println(list2.indexOf("Java"));
        System.out.println(list2.isEmpty());
        System.out.println(list3.isEmpty());
        System.out.println(list2.contains("am"));

        list3.sort(null);
        System.out.println(list3);
    }
}
