import java.util.*;

public class Doubly_LL_deletion {

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

    public void deletion() {
        System.out.println(
                "\nPress: 1 - to delete from begining\nPress: 2 - to delete from end\nPress: 3 - to delete from specific location");
        int p = sc.nextInt();
        Node temp = head;
        switch (p) {
            case 1:
                if (head == null)
                    System.out.println("LL does not exist");
                else {
                    temp = head;
                    temp = temp.next;
                    temp.prev = null;
                    head = temp;
                }
                break;

            case 2:
                temp = head;
                if (head == null)
                    System.out.println("LL does not exist");
                else {
                    temp = tail;
                    temp = temp.prev;
                    temp.next = null;
                    tail = temp;
                }
                break;
            case 3:
                System.out.println("Enter the position from where you want to delete");
                int pos = sc.nextInt();
                temp = head;
                Node ptr = temp.next;
                for (int i = 0; i < pos - 2; i++) {
                    temp = temp.next;
                    ptr = ptr.next;
                }
                if (pos == 1)
                    head = head.next;
                else if (ptr.next == null) {
                    temp.next = null;
                    tail = temp;
                } else {
                    temp.next = ptr.next;
                    ptr.next.prev = temp;
                }

                break;

            default:
                System.out.println("Please select correct input");
                deletion();

        }

    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        Doubly_LL_deletion l = new Doubly_LL_deletion();

        l.creation();
        l.traverser();
        l.deletion();
        System.out.println("After insertion the value is:");
        l.traverser();
    }
}
