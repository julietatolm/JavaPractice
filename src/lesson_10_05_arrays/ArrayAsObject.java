package lesson_10_05_arrays;

import lesson_09_26_reference.Cat;

public class ArrayAsObject {

    public static void main(String[] args) {
        int[] intArr = new int[3];
        byte[] byteArr = new byte[3];
        short[] shortArr = new short[3];
        String[] strArr = new String[3];
        Cat[] catArr = new Cat[3];

        System.out.println(intArr.getClass());
        System.out.println(byteArr.getClass());
        System.out.println(shortArr.getClass());
        System.out.println(strArr.getClass());
        System.out.println(catArr.getClass());

    }

}
