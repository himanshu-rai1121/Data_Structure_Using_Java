import java.util.*;

public class Linked_List_creation {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Scanner sc = new Scanner(System.in);

    public void creation() {
        int data, n;
        // Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter data");
            data = sc.nextInt();

            Node new_node = new Node(data);
            if (head == null)
                head = new_node;

            else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("want to add more data press 1 , else press any value");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverser() {
        Node temp = head;
        if (head == null)
            System.out.println("LL does not exist");

        else {

            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        Linked_List_creation l = new Linked_List_creation();

        l.creation();
        l.traverser();
    }
}