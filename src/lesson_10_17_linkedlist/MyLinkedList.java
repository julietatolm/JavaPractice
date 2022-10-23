package lesson_10_17_linkedlist;

import lombok.Getter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Getter

public class MyLinkedList implements Iterable<Integer> {
    /*
    1.
    pushToHead(int data);
    pushToTail(int data);
    ------pushToIndex(int index, int data);
    removeFirst();
    removeLast();
    -------removeByIndex(int index);
    -------getByIndex(int index);
    size();
    print();

    2.
    next task - implements Iterable
    */
    private Node head;
    private Node tail;
    private int size = 0;

    public int size() {
        return size;
    }


    public void pushToHead(int data) {
        Node newNode = new Node(data, null);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        head.setPrev(newNode);
        newNode.setNext(head);
        head = newNode;
    }

    public void pushToTail(int data) {
        Node newNode = new Node(data, null);
        size++;
        if (tail == null) {
            tail = newNode;
            head = newNode;
            return;
        }
        tail.setNext(newNode);
        newNode.setPrev(tail);
        tail = newNode;
    }

    public boolean removeFirst() {
        if (head == null) {
            return false;
        }
        size--;
        Node temp = head;
        head = head.getNext();
        head.setPrev(null);
        temp.setNext(null);
        return true;
    }

    public boolean removeLast() {
        if (tail == null) {
            return false;
        }
        size--;
        tail = tail.getPrev();
        tail.setNext(null);
        return true;
    }

    public void print() {
        for (Integer i : this) {
            System.out.print(i + " ");
        }
            System.out.println();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyLinkedListIterator(this);
    }

}
