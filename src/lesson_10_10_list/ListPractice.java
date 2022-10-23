package lesson_10_10_list;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0,3);

        System.out.println(list);

        int[] array = {1, 2, 3};
        System.out.println(Arrays.toString(array));

        List<String> list2 = new ArrayList<>();
        list2.add("I");
        list2.add("am");
        list2.add("Java");
        list2.add(2,"study");
        System.out.println(list2);

        list2.set(2, "learning");
        System.out.println(list2);

        boolean removeObj = list2.remove("Java");
        System.out.println(list2);

        String removeStr = list2.remove(0);

        List<String> arcList = new ArrayList<>();
        arcList.add(removeStr);
        System.out.println(removeStr);
        arcList.add(list2.remove(0));

        System.out.println(list2);
        System.out.println(arcList);
    }
}
