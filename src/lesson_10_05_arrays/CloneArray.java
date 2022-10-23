package lesson_10_05_arrays;

import lesson_09_26_reference.Author;
import lesson_09_26_reference.Book;

public class CloneArray {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3};
        int[] clone = intArr.clone();

        System.out.println(intArr == clone);
        System.out.println(intArr[0] == clone[0]);

        for (int i = 0; i < clone.length; i++) {
            System.out.print(clone[i] + " ");
        }
        System.out.println();

        int[][] arr = {{10,20,30}, {40,50}};
        int[][] cloneArr = arr.clone();

        System.out.println(arr == cloneArr);
        System.out.println(arr[0] == cloneArr[0]);

        System.out.println();

        Book[] books = {new Book("Test")};
        Book[] cloneBooks = books.clone();
        System.out.println(books == cloneBooks);
        System.out.println(books[0]);
        System.out.println(cloneBooks[0]);
        cloneBooks[0].setAuthor(new Author("Abd", 5));
        System.out.println(books[0]);
        System.out.println(cloneBooks[0]);
    }
}
