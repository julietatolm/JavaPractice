package lesson_10_17_linkedlist;

import lesson_10_17_linkedlist.MyLinkedList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

//        linkedList.addLast(5);
//        linkedList.getFirst();

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.pushToTail(0);
        myLinkedList.pushToHead(1);
        myLinkedList.pushToHead(3);
        myLinkedList.pushToHead(18);
        myLinkedList.pushToHead(4);
        System.out.println("size: " + myLinkedList.size());

        for (Integer i : myLinkedList) {
            System.out.print(i + " ");
        }
        System.out.println();

        myLinkedList.pushToTail(44);
        myLinkedList.pushToTail(5);

        for (Integer i : myLinkedList) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("size: " + myLinkedList.size());

        myLinkedList.print();




    }
}