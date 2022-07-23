import java.util.*;

public class Circular_LL_creation_and_traverser {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;
    Scanner sc = new Scanner(System.in);

    public void creation() {
        int data;
        // Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of element you want to add");
        int m = sc.nextInt();
        System.out.println("Enter data");
        Node temp = null;
        for (int i = 0; i < m; i++) {
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
                new_node.next = head;
                temp = new_node;
            }

            else {
                // new_node.next = head;
                // head = new_node;
                temp.next = new_node;
                new_node.next = head;
                tail = new_node;
                temp = temp.next;
            }
        }
    }

    public void traverser() {
        Node temp = head;
        if (head == null)
            System.out.println("LL does not exist");

        else {

            do {
                System.out.print(temp.data + "->");
                temp = temp.next;
            } while (temp != head);
        }
        // System.out.println(tail.data);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        Circular_LL_creation_and_traverser l = new Circular_LL_creation_and_traverser();

        l.creation();
        l.traverser();
    }
}
