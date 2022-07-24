import java.util.Scanner;

class queue {

    Scanner sc = new Scanner(System.in);

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    void enqueue() {
        System.out.println("Enter the number of element to be Inserted");
        int num = sc.nextInt();
        int data = 0;
        for (int i = 0; i < num; i++) {
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (front == null && rear == null) {
                front = new_node;
                rear = new_node;
            } else {
                rear.next = new_node;
                rear = new_node;
            }
        }
    }

    void dequeue() {
        if (front == null)
            System.out.println("Underflow: No data is present");
        else {
            System.out.println("Removed data is: " + front.data);
            front = front.next;
        }
    }

    void traverse() {
        Node temp = front;
        if (temp == null)
            System.out.println("Queue is empty");
        else {
            System.out.print("Data in Queue is: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

}

public class Queue_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0;
        queue qu = new queue();
        do {
            System.out.println("Press: 1 to enqueue data\n Press: 2 to dequeue data\nPress: 3 to traverse");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    qu.enqueue();
                    break;
                case 2:
                    qu.dequeue();
                    break;
                case 3:
                    qu.traverse();
                    break;
                default:
                    System.out.println("Wrong input");
            }
            System.out.println("press 1 to repeat else press any key to exit:-");
            p = sc.nextInt();
        } while (p == 1);
        sc.close();
    }
}
