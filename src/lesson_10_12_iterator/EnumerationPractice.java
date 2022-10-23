package lesson_10_12_iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationPractice {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(1);
        vector.addElement(1);
        vector.addElement(1);

        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            int i = enumeration.nextElement();
            System.out.print(i + " ");
        }


    }
}
