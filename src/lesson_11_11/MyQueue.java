package lesson_11_11;

public interface MyQueue {
    void pushToEnd(int data);
    Integer remove();
    Integer peek();
    boolean isEmpty();
    public int size();

    void reallocate(int size);
}
