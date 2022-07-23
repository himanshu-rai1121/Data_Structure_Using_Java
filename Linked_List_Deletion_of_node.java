import java.util.*;

public class Linked_List_Deletion_of_node {

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
                temp = new_node;
            }

            else {
                // new_node.next = head;
                // head = new_node;
                temp.next = new_node;
                temp = temp.next;
            }
        }
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

    public void deletion() {
        System.out.println(
                "\nPress: 1 - to delete from begining\nPress: 2 - to delete from end\nPress: 3 - to delete from specific location\npress: 0 - to stop");
        int p = sc.nextInt();
        switch (p) {
            case 1:
                if (head == null)
                    System.out.println("LL does not exist");
                else {
                    head = head.next;
                }
                break;

            case 2:
                Node temp = head;
                Node q = head;
                if (head == null)
                    System.out.println("LL does not exist");
                else {
                    while (temp.next != null) {
                        temp = temp.next;
                        if (temp.next == null)
                            break;
                        q = temp;
                    }
                    q.next = null;
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
            case 0:
                break;
            default:
                System.out.println("Please select correct input");
                deletion();
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        Linked_List_Deletion_of_node l = new Linked_List_Deletion_of_node();

        l.creation();
        l.traverser();
        l.deletion();
        System.out.println("after deleating element");
        l.traverser();
    }
}
