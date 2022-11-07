package lesson_10_31_;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("I");
        stack.push("am");
        stack.push("Alex");

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);

//        System.out.println(stack.empty());
        System.out.println(stack.search("I"));
        System.out.println(stack.search("am"));
        System.out.println(stack.search("Alex"));
    }

}
