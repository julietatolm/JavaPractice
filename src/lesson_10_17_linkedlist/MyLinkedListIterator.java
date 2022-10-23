package lesson_10_17_linkedlist;

import java.util.Iterator;

public class MyLinkedListIterator implements Iterator<Integer> {

    Node current;

    public MyLinkedListIterator(MyLinkedList list) {
        current = list.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Integer next() {
        Integer data = current.getData();
        current = current.getNext();
        return data;
    }
}
