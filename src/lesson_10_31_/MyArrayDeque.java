package lesson_10_31_;

import java.util.Arrays;

public class MyArrayDeque implements MyDeque {
    private Integer[] elements;
    private int headIndex;
    private int tailIndex;
    private int numberOfElements = 0;

    public MyArrayDeque(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be 0 or higher");
        }
        elements = new Integer[capacity];
        headIndex = (elements.length-1) / 2;
        tailIndex = (elements.length-1) / 2;
    }

    @Override
    public void addToHead(Integer element) {
        if (isEmpty()) {
            elements[headIndex] = element;
        } else {
            elements[headIndex - 1] = element;
            headIndex--;
            if (headIndex == 0) {
                grow();
            }
        }
        numberOfElements++;
    }

    @Override
    public void addToTail(Integer element) {
        if (isEmpty()) {
            elements[tailIndex] = element;
        } else {
            elements[tailIndex + 1] = element;
            tailIndex++;
            if (tailIndex == elements.length - 1) {
                grow();
            }
        }
        numberOfElements++;
    }

    @Override
    public Integer removeHead() {
        if (isEmpty()) {
            System.out.println("No such element");
            return null;
        }
        int temp = elements[headIndex];
        elements[headIndex] = null;
        headIndex++;
        numberOfElements--;
        return temp;
    }

    @Override
    public Integer removeTail() {
        if (isEmpty()) {
            System.out.println("No such element");
            return null;
        }
        int temp = elements[tailIndex];
        elements[tailIndex] = null;
        tailIndex--;
        numberOfElements--;
        return temp;
    }

    @Override
    public Integer peekHead() {
        if (isEmpty()) {
            System.out.println("No such element");
            return null;
        }
        return elements[headIndex];
    }

    @Override
    public Integer peekTail() {
        if (isEmpty()) {
            System.out.println("No such element");
            return null;
        }
        return elements[tailIndex];
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    @Override
    public Integer getByIndex(int index) {
        if (isEmpty()) {
            System.out.println("No such element");
            return null;
        }
        if (index < 0 || index > numberOfElements) {
            System.out.println("Index is out of boarders");
            return null;
        }

        int count = 0;
        for (Integer integer : elements) {
            if (integer != null) {
                count++;
                if (count == index) {
                    return integer;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyArrayDeque{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }

    @Override
    public boolean contains(Integer element) {
        if (isEmpty()) {
            System.out.println("No such element");
            return false;
        }

        for (Integer integer : elements) {
            if (integer == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return numberOfElements;
    }


    public void grow() {
        Integer[] temp = elements;
        elements = new Integer[temp.length*2];


        headIndex = (elements.length-numberOfElements)/2;
        tailIndex = (elements.length-numberOfElements)/2;
        numberOfElements = 0;

        for(Integer integer : temp) {
            if (integer != null) {
                 addToTail(integer);
            }
        }
    }
}
