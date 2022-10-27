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
    pushToIndex(int index, int data);
    removeFirst();
    removeLast();
    removeByIndex(int index);
    getByIndex(int index);
    size();
    print();

    2.
    next task - implements Iterable
    */
    private Node head;
    private int size = 0;

    public int size() {
        return size;
    }


    public void pushToHead(int data) {
        Node newNode = new Node(data, null);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.setNext(head);
        head = newNode;
    }

    public void pushToHead2(int data) {
        Node newNode = new Node(data, null);
        newNode.setNext(head);
        head = newNode;
        size++;
        }

    public void pushToTail(int data) {
        size++;
        if (head == null) {
            head = new Node(data, null);
            return;
        }

        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(new Node(data, null));
    }

    public boolean removeFirst() {
        if (head == null) {
            return false;
        }
        size--;
        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
        return true;
    }

    public boolean removeLast() {
        if (head == null) {
            return false;
        }
        size--;

        if (head.getNext() == null) {
            head = null;
            return true;
        }

        if (head.getNext().getNext() == null) {
            head.setNext(null);
            return true;
        }
        
        Node temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(null);
        return true;
    }

    public void print() {
        for (Integer i : this) {
            System.out.print(i + " ");
        }
            System.out.println();
    }

    public Integer getByIndex(int index) {
        if (head == null || index < 0 || index >= size) {
            return -1;
        }

        Node temp = head;
        int res = 0;
        while (temp.getNext() != null) {
            if (res == index) {
                return temp.getData();
            }
            temp = temp.getNext();
            res++;
        }
        return temp.getData();
    }

    public boolean removeByIndex(int index) {
        if (head == null || index < 0 || index >= size) {
            return false;
        }

        size--;
        if (index == 0) {
            head = head.getNext();
        }

        Node temp = head;
        int res = 0;
        while (temp.getNext() != null) {
            if (res + 1 == index) {
                temp.setNext(temp.getNext().getNext());
                return true;
            }
            temp = temp.getNext();
            res++;
        }
        return true;
    }

    public int getIndexByData(Integer data) {
        if (head == null) {
            return -1;
        }

        if (head.getData() == data) {
            return 0;
        }

        Node temp = head;
        int res = 0;
        while (temp.getNext() != null) {
            res++;
            if (temp.getNext().getData() == data) {
                return res;
            }
            temp = temp.getNext();
        }
        return -1;
    }

    public void pushToIndex(int index, int data) {
        Node newNode = new Node(data, null);
        size++;
        if (index == 0) {
            pushToHead2(data);
        }

        Node temp = head;
        int res = 1;
        while (temp.getNext() != null) {
            if (res == index) {
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
            }
            temp = temp.getNext();
            res++;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyLinkedListIterator(this);
    }

}
