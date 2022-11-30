package lesson_11_07_tree;

import lesson_11_07_tree.comparators.MyBinaryTree;

public class TreePractice {
    public static void main(String[] args) {
        MyBinaryTree binaryTree = new MyBinaryTree();
        binaryTree.insert(2, "Aleks");
        binaryTree.insert(1, "Thea");
        binaryTree.insert(3, "Thomas");

        binaryTree.print();


    }
}
