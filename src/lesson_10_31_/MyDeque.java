package lesson_10_31_;

public interface MyDeque {

    void addToHead(Integer element);
    void addToTail(Integer element);
    Integer removeHead();
    Integer removeTail();
    Integer peekHead();
    Integer peekTail();
    boolean isEmpty();
    Integer getByIndex(int index);
    boolean contains(Integer element);
    public int size();


    default void grow() {
    }
//int calculateNewCapacity(int currentCapacity); int calculateAdditionalCapacity(int currentCapacity);
//additional JUnit tests for this methods */

}
