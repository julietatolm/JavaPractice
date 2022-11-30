package lesson_11_11;

import java.util.Arrays;

public class MyArrayQueue implements MyQueue {
    private Integer[] elements;
    private int endIndex;
    private int startIndex;
    private int numberOfElements = 0;

    public MyArrayQueue(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be 0 or higher");
        }
        elements = new Integer[capacity];
        startIndex = 0;
        endIndex = 0;
    }

    @Override
    public void pushToEnd(int data) {
        if (endIndex == elements.length) {
            reallocate(numberOfElements * 2);
        }

        elements[endIndex] = data;
        endIndex++;
        numberOfElements++;
    }

    @Override
    public Integer remove() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Array is empty");
        }

        Integer a = elements[startIndex];
        elements[startIndex] = null;
        startIndex++;
        numberOfElements--;

        //
        if (numberOfElements < elements.length / 2) {
            reallocate((int) (elements.length * 0.75));
        }
        return a;
    }

    @Override
    public Integer peek() {
        return elements[startIndex];
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public void reallocate(int size) {
        Integer[] elementsNew = new Integer[size];
        for (int i = startIndex, j = 0; i < elements.length; i++, j++) {
            elementsNew[j] = elements[i];
        }
        startIndex = 0;
        endIndex = numberOfElements;
        elements = elementsNew;
    }

    @Override
    public String toString() {
        return "MyArrayQueue{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
