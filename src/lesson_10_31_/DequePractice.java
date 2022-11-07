package lesson_10_31_;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequePractice {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(1);
        deque.add(3);
        deque.add(5);

        MyArrayDeque myArrayDeque = new MyArrayDeque(10);
        System.out.println(myArrayDeque.isEmpty());
        System.out.println(myArrayDeque.size());

        myArrayDeque.addToHead(5);
        myArrayDeque.addToHead(5);
        myArrayDeque.addToHead(5);
        myArrayDeque.addToTail(1);
        myArrayDeque.addToTail(3);

        System.out.println(myArrayDeque);
        System.out.println(myArrayDeque.getByIndex(6));
        System.out.println(myArrayDeque.peekHead());
        System.out.println(myArrayDeque.peekTail());

        System.out.println(myArrayDeque.removeHead());
        System.out.println(myArrayDeque.removeTail());
        System.out.println(myArrayDeque.removeTail());
        System.out.println(myArrayDeque.removeTail());
        System.out.println(myArrayDeque.removeTail());
        System.out.println(myArrayDeque.removeTail());
        System.out.println(myArrayDeque);

    }
}
