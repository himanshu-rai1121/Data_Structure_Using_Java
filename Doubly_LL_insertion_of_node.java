import java.util.*;

public class Doubly_LL_insertion_of_node {

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

    public void insertion() {
        System.out.println(
                "\nPress: 1 - to insert at begining\nPress: 2 - to insert at end\nPress: 3 - to insert at specific location");
        int m = sc.nextInt();

        System.out.println("enter data");
        int data = sc.nextInt();
        Node new_node = new Node(data);

        switch (m) {
            case 1:
                new_node.next = head;
                head.prev = new_node;
                head = new_node;
                break;

            case 2:
                tail.next = new_node;
                new_node.prev = tail;
                tail = new_node;
                break;

            case 3:
                System.out.println("enter the position where the data is to be entered");
                int pos = sc.nextInt();
                Node temp = head;
                Node ptr = temp.next;
                for (int i = 0; i < pos - 2; i++) {
                    temp = ptr;
                    ptr = ptr.next;
                }
                if (pos == 1) {
                    new_node.next = head;
                    head.prev = new_node;
                    head = new_node;
                } else {
                    new_node.next = ptr;
                    ptr.prev = new_node;
                    temp.next = new_node;
                    new_node.prev = temp;
                }
                break;

            default:
                System.out.println("Please select correct input");
                insertion();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        Doubly_LL_insertion_of_node l = new Doubly_LL_insertion_of_node();

        l.creation();
        l.traverser();
        l.insertion();
        System.out.println("After insertion the value is:");
        l.traverser();
    }
}
