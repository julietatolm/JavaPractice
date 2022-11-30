package lesson_11_28;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        int[][] arr = {{2, 3, 4}, {11, 8, 9}, {22, 1, 5}, {4, 5, 5}};

        Stream<int[]> s = Arrays.stream(arr);
        IntStream sFlat = s.flatMapToInt( (int[] x) -> Arrays.stream(x));

        int[] newArray2 =  sFlat.filter((int p) -> p < 5).toArray();

        int[] newArray = Arrays.stream(arr).flatMapToInt( x1 -> Arrays.stream(x1) ).toArray();
        System.out.println(Arrays.toString(newArray));
    }
}
