import java.util.*;

public class Circular_LL_deletion_beginning_end_location {

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
        System.out.println(tail.next.data);
    }

    public void deletion() {
        System.out.println(
                "\nPress: 1 - to delete from begining\nPress: 2 - to delete from end\nPress: 3 - to delete from specific location");
        int p = sc.nextInt();
        switch (p) {
            case 1:
                if (head == null)
                    System.out.println("LL does not exist");
                else {
                    head = head.next;
                    tail.next = head;
                }
                break;

            case 2:
                Node temp = head;
                Node q = head;
                if (head == null)
                    System.out.println("LL does not exist");
                else {
                    do {
                        temp = temp.next;
                        if (temp.next == head)
                            break;
                        q = temp;
                    } while (temp.next != head);
                    q.next = head;
                    tail = q;
                }
                break;
            case 3:
                System.out.println("Enter the position from where you want to delete");
                int pos = sc.nextInt();
                Node ptr = head;
                for (int i = 0; i < pos - 2; i++) {
                    ptr = ptr.next;
                }
                if (pos == 1)
                    head = head.next;
                else
                    ptr.next = ptr.next.next;
                break;
            default:
                System.out.println("Please select correct input");
                deletion();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        Circular_LL_deletion_beginning_end_location l = new Circular_LL_deletion_beginning_end_location();

        l.creation();
        l.traverser();
        l.deletion();
        System.out.println("After deletion the value is:");
        l.traverser();
    }
}
