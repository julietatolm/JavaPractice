package lesson_10_17_linkedlist;

import lesson_10_17_linkedlist.MyLinkedList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.pushToHead2(18);
        myLinkedList.pushToHead(1);
        myLinkedList.pushToHead(3);
        myLinkedList.pushToHead(3);
        myLinkedList.pushToHead(7);
        myLinkedList.pushToHead2(4);
        myLinkedList.pushToHead2(10);

        System.out.println("size: " + myLinkedList.size());
        myLinkedList.print();

        myLinkedList.pushToTail(44);
        myLinkedList.pushToTail(5);

        System.out.println("size: " + myLinkedList.size());
        myLinkedList.print();

        myLinkedList.removeFirst();
        myLinkedList.removeFirst();

        System.out.println("size: " + myLinkedList.size());
        myLinkedList.print();

        myLinkedList.removeLast();

        System.out.println("size: " + myLinkedList.size());
        myLinkedList.print();

        System.out.println(myLinkedList.getByIndex(0));
        System.out.println(myLinkedList.getByIndex(4));
        System.out.println(myLinkedList.getByIndex(1));

        System.out.println("Index of number 44: " + myLinkedList.getIndexByData(44));
        System.out.println("Index of number 1: " + myLinkedList.getIndexByData(1));

        myLinkedList.removeByIndex(2);

        System.out.println("size: " + myLinkedList.size());
        myLinkedList.print();

        myLinkedList.pushToIndex(4, 100);
        myLinkedList.pushToIndex(0, 101);
        myLinkedList.pushToIndex(15, 102);

        System.out.println("size: " + myLinkedList.size());
        myLinkedList.print();
    }
}