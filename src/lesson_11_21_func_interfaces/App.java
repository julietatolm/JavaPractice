package lesson_11_21_func_interfaces;

import java.util.function.Function;

//Consumer - потребитель, пользователь
// returns nothing but accepts <T> object
//has method accept and method andThen

public class App {
    public static void main(String[] args) {
        //Function
        Function<Double, Long> fRound = aDouble -> Math.round(aDouble);
        long a = fRound.apply( 11.2);
        System.out.println(a);

        //Function + compose
        Function<Double, Double> div2 = x -> x/2.0;
        System.out.println(fRound.compose(div2).apply(11.2));

        //Function + andThen
        Function<Long, Double> div3 = x -> x/2.0;
        System.out.println(fRound.andThen(div3).apply(11.2));

        Function<String, String> f1 = s1 -> s1 +"1";
        Function<String, String> f2 = s1 -> s1 +"2";
        Function<String, String> f3 = s1 -> s1 +"3";
        Function<String, String> f4 = s1 -> s1 +"4";
        Function<String, String> f5 = s1 -> s1 +"5";

        String res1 = f1.andThen(f2).andThen(f3).andThen(f4).andThen(f5).apply("andThen: ");
        String res2 = f1.compose(f2).compose(f3).compose(f4).compose(f5).apply("compose: ");

        System.out.println(res1);
        System.out.println(res2);
        System.out.println("------------");

        Function<Integer, Integer> f6 = Function.identity();

//        stream().map(Function.identity());
        System.out.println(f6.compose( (Integer x) -> x/2).apply(61));
        System.out.println(f6.andThen( (Integer x) -> x/2).apply(61));

//        String testString = "this is the test";

//        Supplier<String> sf1 = () -> testString.substring(0, 4);
//        Supplier<Double> sf2 = () -> Math.random();

//        System.out.println(sf1.get());
//        System.out.println(sf2.get());

//        List<Integer> l1 = new ArrayList<Integer>();
//        List<Integer> l2 = new ArrayList<Integer>();
//        l1.add(1);
//        l1.add(8);
//        l1.add(7);
//
//        Consumer<List<Integer>> cf1 = xcf1 -> xcf1.forEach(a -> System.out.println( a ));
//
//        cf1.andThen( (List<Integer> list) -> list.forEach( z -> l2.add(z/2))).accept(l1);
//
//        System.out.println("result list: ");
//        l2.forEach(a -> System.out.println( a ));

    }
}
