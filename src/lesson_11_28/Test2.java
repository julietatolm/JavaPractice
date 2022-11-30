package lesson_11_28;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        String[][] array = {{"a", "b"}, {"c", "d"}, {"e", "f"}};

        List<String> list = Arrays.stream(array)
                .flatMap(x -> Arrays.stream(x))
                .filter(s -> !s.equals("a"))
                .peek(s -> System.out.print(s + " "))
                .collect(Collectors.toList());

//        Stream<String> res1 = Arrays.stream(array).flatMap((String[] arr) -> Arrays.stream(arr));
//        Stream<String> res2 = res1.filter((String s) -> !s.equals("a"));
//        List<String> res3 = res2.collect(Collectors.toList());
//        System.out.println(res3);

//        res3.forEach(s -> System.out.println(s));

        //сколько раз объект «Big» встречается в коллекции
        List<String> list2 = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");

        long a = list.stream().filter(s -> s.contains("Big")).count();

        System.out.println("Big count: " + a);



    }
}
