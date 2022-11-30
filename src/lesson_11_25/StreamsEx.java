package lesson_11_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StreamsEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(34);
        list.add(45);
//        list.stream().map(Function.identity() +).reduce();

        int[] array = {6, 54, 32, 16, 5, 4, 98, 74, 56};
        int[] result = Arrays.stream(array)
                .map(el -> {
                    if (el % 3 == 0) {
                        el = el / 3;
                    }
                    return el;
                }).toArray();

        int[] result1 = Arrays.stream(array)
                .filter(el -> el % 3 == 0)
                .toArray();

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));


    }
}
