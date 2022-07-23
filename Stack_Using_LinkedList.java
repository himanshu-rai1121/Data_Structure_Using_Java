import java.util.Scanner;

class stack {

    Scanner sc = new Scanner(System.in);

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void push() {
        /// .........push....
        System.out.println("Enter data");
        int data = sc.nextInt();
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;

    }

    void pop() {
        if (head == null)
            System.out.println("Underflow");
        else {
            head = head.next;
            System.out.println("data poped");
        }
    }

    void traverse() {
        // ......traverser......
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
        }
    }

}

public class Stack_Using_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        int p = 0;
        do {
            System.out.println("Press: 1 to push data\n Press: 2 to pop data\nPress: 3 to traverse");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.traverse();
                    break;
                default:
                    System.out.println("Wrong input");
            }
            System.out.println("press 1 to repeat else press any key to exit:-");
            p = sc.nextInt();
        } while (p == 1);

    }
}
