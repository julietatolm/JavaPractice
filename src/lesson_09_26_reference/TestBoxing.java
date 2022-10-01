package lesson_09_26_reference;

import java.util.ArrayList;

public class TestBoxing {
    Integer i = new Integer(20);

    //unboxing
    int unbox = i;

    Character a = 'a';
    Character b = new Character('b');
    char ch = a;

    public void testCollectionBoxing() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);

        Integer i = new Integer(20);
        int a = i.intValue();
    }
}
