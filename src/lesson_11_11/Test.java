package lesson_11_11;

public class Test {
    public static void main(String[] args) {
        MyArrayQueue myArrayQueue = new MyArrayQueue(4);

        System.out.println(myArrayQueue.isEmpty());
        myArrayQueue.pushToEnd(1);
        myArrayQueue.pushToEnd(2);
        myArrayQueue.pushToEnd(3);
        myArrayQueue.pushToEnd(4);
        System.out.println(myArrayQueue.toString());
        myArrayQueue.remove();
        myArrayQueue.remove();
        myArrayQueue.remove();
        System.out.println(myArrayQueue.toString());
        myArrayQueue.pushToEnd(5);
        myArrayQueue.pushToEnd(6);
        myArrayQueue.pushToEnd(7);
        System.out.println(myArrayQueue.toString());

    }
}
