package lesson_12_07_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
//        Создать функцию, которая обрезает входную строку до 5 символов, делает их upper case
//                и добавляет ____ в конец.

        Function<String, String> function = s -> s.substring(0, 5);
        Function<String, String> function1 = s -> s.toUpperCase();
        Function<String, String> function2 = s -> s + "____";

        Function<String, String> function3 = function.compose(function1).andThen(function2);

        System.out.println(function3.apply("String Function"));

        Function<String, String> function4 =
                ((Function<String, String>) s2 -> s2.substring(0, 5)).compose((Function<String, String>) s1 -> s1.toUpperCase()).andThen(s -> s + "____");

        System.out.println(function3.apply("String Function"));

        Function<String, String> function5 =
                ((Function<String, String>) s2 -> s2.substring(0, 5)).compose((Function<String, String>) s1 -> s1.toUpperCase()).andThen(s -> s + "____");

        List<String> stringList1 = Arrays.asList("One", "Two", "Three", "One");

    }
}
