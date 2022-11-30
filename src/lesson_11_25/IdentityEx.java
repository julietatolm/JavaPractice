package lesson_11_25;

import java.util.function.Function;

public class IdentityEx {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = Function.identity();
        System.out.println(function1.apply(100));
    }
}
