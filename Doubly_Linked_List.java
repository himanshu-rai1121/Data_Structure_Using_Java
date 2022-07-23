import java.util.*;

public class Doubly_Linked_List {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;
    Scanner sc = new Scanner(System.in);

    public void creation() {
        int data;

        System.out.println("enter the number of element you want to add");
        int m = sc.nextInt();
        System.out.println("Enter data");
        Node temp = null;
        for (int i = 0; i < m; i++) {
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                temp = new_node;
                tail = new_node;
            }

            else {
                // new_node.next = head;
                // head = new_node;
                temp.next = new_node;
                new_node.prev = temp;
                temp = temp.next;
                tail = new_node;
            }
        }
    }

    public void traverser() {
        Node temp = head;
        if (head == null)
            System.out.println("LL does not exist");

        else {

            while (temp != null) {
                System.out.print(temp.data + "<->");
                temp = temp.next;
            }

        }
        // System.out.println(tail.data);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        Doubly_Linked_List l = new Doubly_Linked_List();

        l.creation();
        l.traverser();
    }
}
