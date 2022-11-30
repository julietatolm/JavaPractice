package lesson_11_23_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class PracticeLimitSkipDistinctPeek {
    public static void main(String[] args) {

        Stream<Integer> sI2 = Stream.of(1, 2, 3, 4, 5, 9, 6, 8, 6, 7, 4, 1, 2, 3, 6, 9, 0);

        //limit
//        List<Integer> collect = sI2.limit(2).collect(Collectors.toList());

        //skip
//        List<Integer> collect = sI2.skip(3).collect(Collectors.toList());

        //distinct
//        List<Integer> collect = sI2.distinct().collect(Collectors.toList());

        //peek
//        List<Integer> collect = sI2.filter(i -> i%2 == 0)
//                .peek(integer -> System.out.println(integer))
//                .collect(Collectors.toList());

//        AtomicInteger total = new AtomicInteger();
//        List<Integer> collect = sI2.filter(i -> i%2 == 0)
//                .peek(integer -> {
//                    total.getAndIncrement();
//                    System.out.println("total " + total);
//                    System.out.println(integer);
//                })
//                .collect(Collectors.toList());

        //count
//        long collect = sI2.distinct().peek(e -> System.out.print(e + " ")).count();

//        System.out.println();
//        System.out.println(collect);


        System.out.println(sI2.min( (x1,x2)  -> x1-x2).get());
//        System.out.println(sI2.min( (x1,x2) -> -x1 +x2).get());
//        System.out.println(sI2.min(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return -o1 +o2;
//            }
//        }));
    }
}
