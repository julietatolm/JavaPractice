package lesson_11_23_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PracticeFilter {
    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        int res = 0;

        //interactive programming
        for (Integer i : li) {
            if (i % 2 != 0) {
                res = res + i;
            }
        }
//        System.out.println(res);

        //functional programming
        // stream - filter -  reduce
        // stream accepts collection objects
        // filter accepts Stream<T> with Predicate<! super T> (that returns boolean with method test) and returns new
        // filtered Stream<T>
        // reduce accepts Stream<T> with BinaryOperator<T>, accumulate elements and returns Optional<T>
        // reduce can accept first value "identity" - start value for accumulation
        // Optional<T> - can return T or not


        int res2 = li.stream().filter(p -> p % 2 != 0).reduce((y1, y2) -> y1 + y2).orElse(0);
        int res3 = li.stream().filter(integer -> integer % 2 != 0).reduce((y1, y2) -> y2 + y2).orElse(0);

//        System.out.println(res2);

        // optional
        // has method get, isPresent
        // Option is used if we are not sure about the result. Other way is to use method orElse in the end of Stream.
        // or Optional.isPresent


        Optional<Integer> i1 = li.stream().filter(p -> p % 2 != 0).reduce((y1, y2) -> y1 + y2);
//        System.out.println(i1);

        if (i1.isPresent()) {
//            System.out.println(i1.get());
        }
//        System.out.println(i1.orElse(0));

        //predicate
        //a boolean method test
        //can use .and/.or to merge Predicates

//        System.out.println("----------predicate");
//        String a = "YU-ty-oo-po-hfhf-";
//
//        Predicate<String> pS = s -> s.split("-").length == 5;
//        System.out.println(pS.test(a));
//        System.out.println("----------");

//        pS = pS.and(s -> s.startsWith("Y"));
//        System.out.println(pS.test(a));
//
//        pS = pS.or(s -> s.startsWith("Y"));
//        System.out.println(pS.test(a));
    }
}
