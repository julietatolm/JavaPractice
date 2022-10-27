package lesson_10_17_linkedlist;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Node {
    private Integer data;
    private Node next;

    public Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }
}
