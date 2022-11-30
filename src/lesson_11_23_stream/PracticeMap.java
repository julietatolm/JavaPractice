package lesson_11_23_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeMap {
    public static void main(String[] args) {
        List<String> il2 = Arrays.asList("18YU", "ty", "TRghdfszxh", "ZE", "10hfhf");

//        int res = il2.stream().map(s3 -> s3.length()).reduce( (s1, s2) -> s1 + s2).orElse(0);

//        System.out.println(res);

        //map
//        List<Integer> collect = sI2.map(x -> x*x).collect(Collectors.toList());
//        Set<Integer> collect = sI2.map(x -> x*x).collect(Collectors.toSet());
//        Set<String> collect = sI2.map(x -> x * x + " ").collect(Collectors.toSet());

        //flatMap
//        Stream<List<Integer>> sI3 = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3, 4, 5, 6),
//                Arrays.asList(8, 16, 3, 4, 10));

//        List<Integer> collect = sI3.flatMap( (List<Integer> l) -> l.stream() ).collect(Collectors.toList());
//        Set<Integer> collect = sI3.flatMap( (List<Integer> l) -> l.stream() ).collect(Collectors.toSet());
//        List<Integer> collect =
//                sI3.flatMap( (List<Integer> l) -> l.stream() ).sorted().distinct().collect(Collectors.toList());

//        System.out.println();
//        System.out.println(collect);

        List<String> words = Arrays.asList("a1", "b2", "g4", "u8", "a1", "g4", "u8", "a1", "a1");
//
//        Map<String,Integer> res = words.stream().collect(Collectors.toMap( (String x) -> x,  (String x) -> 1, (y1,
//                y2) -> y1+y2));
//        System.out.println(res);

        System.out.println(words.stream().findAny().get());
        System.out.println(words.stream().findFirst().get());
        System.out.println(words.stream().anyMatch(p -> p.equals("b2")));
        System.out.println(words.stream().anyMatch(p -> p.equals("b3")));
        System.out.println(words.stream().allMatch(p -> p.equals("b3")));


    }
}
