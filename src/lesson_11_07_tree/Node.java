package lesson_11_07_tree;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Node {
    private Node left;
    private Node right;
    private int key;
    private String value;
}
